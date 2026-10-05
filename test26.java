import java.util.*;

public class test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String[] parts = line.split(" ", 2);

            String memberId = parts[0];
            String[] books = parts[1].split(",");

            for (String book : books) {
                System.out.println(memberId + " " + book);
            }
        }
        sc.close();
    }
}