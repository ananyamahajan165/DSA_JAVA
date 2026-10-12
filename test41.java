import java.util.Scanner;

public class test41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int square = x*x;
            sb.append(square);
            if(i<n-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
