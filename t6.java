import java.util.*;

class SubmissionCounter {

    private int total = 0;

    public synchronized void submit() {
        total++;
    }

    public int getTotal() {
        return total;
    }
}

class SubmissionThread extends Thread {

    private SubmissionCounter counter;
    private int submissions;

    SubmissionThread(SubmissionCounter counter,int submissions) {

        this.counter = counter;
        this.submissions = submissions;
    }

    public void run() {

        for (int i = 0; i < submissions; i++) {
            counter.submit();
        }
    }
}

public class t6{
    public static void main(String[] args)
            throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        SubmissionCounter counter =new SubmissionCounter();

        Thread t1 =new SubmissionThread(counter, n1);

        Thread t2 =new SubmissionThread(counter, n2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Total Submissions: " +counter.getTotal());
    }
}