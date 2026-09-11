import java.util.Scanner;

@FunctionalInterface
interface Check{
    boolean check(int n);
}
public class stream3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Check c = n->n%2==0;
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        if(c.check(n)){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        scn.close();
    }
}
