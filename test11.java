import java.util.*;

public class test11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int task = sc.nextInt();

        if (!list.remove((Integer) task)) {
            System.out.println("Task Not Found");

        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
}