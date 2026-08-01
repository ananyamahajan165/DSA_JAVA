import java.util.*;
public class Armstrong {
    static boolean armstrong(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(armstrong(a)){
            System.out.println("Yes its a armstrong number");
        }
        else{
            System.out.println("No");
        }
    }
}