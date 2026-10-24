import java.util.*;
public class PrimeOptimal {
    public boolean brutePrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        PrimeBrute obj = new PrimeBrute();
        System.out.println(obj.brutePrime(x));
        sc.close();
    }
}
