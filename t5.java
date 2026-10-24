import java.util.*;
import java.util.concurrent.*;

class LoginThread extends Thread {

    private Queue<Integer> loginRecords;
    private int count;

    LoginThread(
            Queue<Integer> loginRecords,
            int count) {

        this.loginRecords = loginRecords;
        this.count = count;
    }

    public void run() {

        for (int i = 0; i < count; i++) {
            loginRecords.add(i);
        }
    }
}

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Queue<Integer> loginRecords =
                new ConcurrentLinkedQueue<>();

        Thread t1 =
                new LoginThread(loginRecords, n1);

        Thread t2 =
                new LoginThread(loginRecords, n2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
                "Total Login Records: " +
                loginRecords.size()
        );
    }
}