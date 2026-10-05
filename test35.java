import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class test35 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, String> employees = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();

            employees.put(id, name);
        }
        int searchId = sc.nextInt();
        Optional<String> res = Optional.ofNullable(employees.get(searchId));
        System.out.println(res.orElse("Employee not found"));
        sc.close();
    }
}
