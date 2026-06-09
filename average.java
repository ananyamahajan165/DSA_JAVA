import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            if((a+b)>=70 && (a+c)>=70 && (b+c)>=70){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }
}
