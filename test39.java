import java.util.Scanner;

public class test39 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.gc();

        System.out.println("Garbage Collection Requested");
        sc.close();
    }
}
