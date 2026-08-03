import java.util.Scanner;

public class CountPrime {
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static int range(int a,int b){
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        range(L, R);
        sc.close();
    }
}
