import java.util.*;

public class test12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        if (set.size() > n / 2.0) {
            System.out.println("High Unique Registration");
        } else {
            System.out.println("Low Unique Registration");
        }
        sc.close();
    }
}