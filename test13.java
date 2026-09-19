import java.util.*;

public class test13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int target = sc.nextInt();

        Integer result = set.lower(target);
        if (result == null) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
        sc.close();
    }
}