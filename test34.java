import java.util.Scanner;

interface TemperatureCheck{
    boolean check(int temp);
}
public class test34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureCheck safe = temp -> temp>=20 && temp<=80;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(safe.check(temp)){
                System.out.println("Safe");
            }
            else{
                System.out.println("Unsafe");
            }
        }
        sc.close();
    }
}
