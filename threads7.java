class MyThread extends Thread {

    MyThread(String name) {
        setName(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class threads7 {
    public static void main(String[] args) {

        MyThread low = new MyThread("Low");
        MyThread normal = new MyThread("Normal");
        MyThread high = new MyThread("High");

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
    }
}