import java.util.Scanner;

public class EvenOdd {

    static void checkEvenOdd(int n) {
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        checkEvenOdd(n);
    }
}