import java.util.*;

public class test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        int threshold = sc.nextInt();

        int total = salaries.stream().filter(x -> x > threshold).reduce(0, (a, b) -> a + b);

        System.out.println(total);
        sc.close();
    }
}