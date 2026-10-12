import java.util.Scanner;

public class test45 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fee;
        if(n==0){
            fee=0;
        }
        else if(n==2){
            fee=n*20;
        }
        else{
            fee=n*40;
        }
        System.out.println(fee);
        sc.close();
}
}