import java.util.Scanner;

public class rings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {
            int n = scn.nextInt();
            int x = scn.nextInt();

            int bill = n * x;

            if (bill >= 10000 && bill <= 99999) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scn.close();
    }
}