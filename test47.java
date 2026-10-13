import java.util.*;

public class test47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        names.stream().map(String::toUpperCase).forEach(name -> System.out.print(name + " "));
        sc.close();
    }
}


// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         List<String> names = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             names.add(sc.next());
//         }
//         // Method reference
//         names.replaceAll(String::toUpperCase);
//         for (String name : names) {
//             System.out.print(name + " ");
//         }
//     }
// }