import java.util.PriorityQueue;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        int a = sc.nextInt();
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=q.poll();
        }
        System.out.println(sum);
        sc.close();
    }
}
