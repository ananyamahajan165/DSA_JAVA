public class PowXN {

    public static double myPow(double x, long n) {

        long N = n;

        if (N == 0) {
            return 1;
        }

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        if (N % 2 == 1) {
            return x * myPow(x, N - 1);
        } else {
            return myPow(x * x, N / 2);
        }
    }

    public static void main(String[] args) {

        System.out.println(myPow(2.0, 10)); // 1024.0
        System.out.println(myPow(2.1, 3));  // 9.261
        System.out.println(myPow(2.0, -2)); // 0.25
    }
}