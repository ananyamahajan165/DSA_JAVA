class MyThread extends Thread {

    String message;

    MyThread(String message) {
        this.message = message;
    }

    public void run() {

        System.out.println(message);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class threads6{
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread 1 complete");
        MyThread t2 = new MyThread("Thread 2 complete");
        MyThread t3 = new MyThread("Thread 3 complete");

        try {

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
