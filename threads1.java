class NumberThread extends Thread {

    int start, end;

    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class threads1 {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread(1, 10);
        NumberThread t2 = new NumberThread(11, 20);

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}
