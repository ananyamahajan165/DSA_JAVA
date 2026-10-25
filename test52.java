import java.util.*;

class BankAccount {

    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public int getBalance() {
        return balance;
    }
}

class WithdrawalThread extends Thread {

    private BankAccount account;
    private int amount;

    WithdrawalThread(
            BankAccount account,
            int amount) {

        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class test52 {
    public static void main(String[] args)
            throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int amount1 = sc.nextInt();
        int amount2 = sc.nextInt();

        BankAccount account =
                new BankAccount(balance);

        Thread t1 =
                new WithdrawalThread(account, amount1);

        Thread t2 =
                new WithdrawalThread(account, amount2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " +account.getBalance());
        sc.close();
    }
}
