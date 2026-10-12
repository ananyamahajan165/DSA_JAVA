import java.util.Scanner;

public class test44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for(int i=0;i<n;i++){
            int quantity = sc.nextInt();
            int price = sc.nextInt();
            total+=(long) quantity*price;
        }
        System.out.println(total);
        sc.close();
    }
}
