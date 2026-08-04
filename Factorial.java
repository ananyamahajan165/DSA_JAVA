import java.util.*;
public class Factorial {
    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    static boolean isStrong(int n) {
    int temp = n;
    int sum = 0;
    while (temp > 0) {
        int digit = temp % 10;
        sum += factorial(digit);
        temp = temp / 10;
    }
    return sum == n;
}
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isStrong(n))
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
        sc.close();
    }
}
