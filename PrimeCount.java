
import java.util.*;

public class PrimeCount {
    public int PrimeCount(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= (n - 1) / i; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        PrimeCount obj = new PrimeCount();

        System.out.println(obj.PrimeCount(x));

        sc.close();
    }
}
