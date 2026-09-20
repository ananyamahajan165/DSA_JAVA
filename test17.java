import java.util.*;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double withdraw = sc.nextDouble();
        try{
            if(balance<=0){
                throw new IllegalArgumentException();
            }

            if(balance<withdraw){
                throw new ArithmeticException();
            }
            balance = balance - withdraw;
            System.out.println(balance);
            }
            catch(IllegalArgumentException e){
            System.out.println("Invalid amount");
        }
        catch (ArithmeticException e){
            System.out.println("Inefficient bal");
}finally{

}
sc.close();
    }
}