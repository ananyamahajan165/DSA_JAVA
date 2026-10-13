import java.util.Scanner;

public class test46 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String cal = sc.next();
        if(cal.equals("ADD")){
            System.out.println(a+b);
        } 
        else{
            System.out.println(a*b);
        }
        sc.close();
}

}
// }import java.util.*;

// interface Operation {
//     int calculate(int a, int b);
// }
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int amount = sc.nextInt();
//         int value = sc.nextInt();
//         String type = sc.next();
//         Operation operation;
//         if (type.equals("ADD")) {operation = (a, b) -> a + b;
//         }
//         else {
//             operation = (a, b) -> a * b;
//         }
//         int result = operation.calculate(amount, value);
//         System.out.println(result);
//     }
// }