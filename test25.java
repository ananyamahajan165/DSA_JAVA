import java.util.*;

public class test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            if (index < 0 || index >= n) {
                throw new ArrayIndexOutOfBoundsException();
            }

            if (divisor == 0) {
                throw new ArithmeticException();
            }

            System.out.println(arr[index] / divisor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");

        } catch (ArithmeticException e) {
            System.out.println("Division By Zero");
        }
        sc.close();
    }
}