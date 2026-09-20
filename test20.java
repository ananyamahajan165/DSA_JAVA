import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.stream().distinct().sorted(Collections.reverseOrder()).limit(3).forEach(x->System.out.print(x+ " "));
        sc.close();
    }
}
