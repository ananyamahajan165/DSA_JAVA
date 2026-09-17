import java.util.*;

public class test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            long weight = sc.nextLong();
            long gram = weight*1000;
            System.out.print(gram);
            if(i<n-1){
                System.out.print(" ");
            }
        }
        sc.close();
    }
}