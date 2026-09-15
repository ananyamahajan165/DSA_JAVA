class ReverseCounter implements Runnable {

    public void run() {

        for (int i = 50; i >= 1; i--) {

            System.out.println(i);

        }
    }
}

public class threads10 {
    public static void main(String[] args) {

        ReverseCounter obj = new ReverseCounter();

        Thread t = new Thread(obj);

        t.start();
    }
}