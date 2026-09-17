import java.util.*;

public class test3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd=0;
        while(n>0){
        int digit = n%10;
        if(digit%2==0){
            even+=digit;
        }else{
        odd+=digit;
        }
        n=n/10;
    }
        System.out.println(even);
        System.out.println(odd);
        sc.close();
    }
}