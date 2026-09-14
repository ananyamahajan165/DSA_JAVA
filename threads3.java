class Countdown extends Thread {

    public void run() {

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Blast Off!");
    }
}

public class threads3 {
    public static void main(String[] args) {

        Countdown t = new Countdown();

        t.start();
    }
}
