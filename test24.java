import java.util.*;

public class test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        int sum = numbers.stream()
                         .filter(x -> x % 2 == 0)
                         .map(x -> x * x)
                         .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
        sc.close();
    }
}