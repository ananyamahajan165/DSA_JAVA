import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {
            int a = scn.nextInt();
            int c = scn.nextInt();

            if ((a + c) % 2 == 0) {
                System.out.println((a + c) / 2);
            } else {
                System.out.println(-1);
            }
        }
        scn.close();
    }
}