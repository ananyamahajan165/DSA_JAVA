import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
public class CustomException2 {
    static void ageexception(int age) throws InvalidAgeException{
        if(age<18) {
            throw new InvalidAgeException("Not eligible for swimming");
        }
        else{
            System.out.println("Eligible");
        }
    }
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            ageexception(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
