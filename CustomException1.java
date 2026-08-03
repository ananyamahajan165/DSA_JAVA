import java.util.*;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
public class CustomException1 {
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        else {
            balance -= amount;
        }
        System.out.println("Remaining Balance = " + balance);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double amount = sc.nextDouble();
        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

