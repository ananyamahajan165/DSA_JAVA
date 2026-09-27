import java.util.*;
import java.util.stream.*;

public class test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }
        Map<String, Long> result = marks.stream()
            .collect(Collectors.groupingBy(
                mark -> {
                    if (mark >= 75) {
                        return "High";
                    } else if (mark >= 50) {
                        return "Medium";
                    } else {
                        return "Low";
                    }
                },
                Collectors.counting()
            ));
        System.out.println("High: " + result.getOrDefault("High", 0L));
        System.out.println("Medium: " + result.getOrDefault("Medium", 0L));
        System.out.println("Low: " + result.getOrDefault("Low", 0L));
        sc.close();
    }
}
