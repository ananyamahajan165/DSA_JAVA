class PrimePrinter implements Runnable {

    public void run() {

        for (int i = 2; i <= 100; i++) {

            boolean prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);
            }
        }
    }
}

public class threads12 {
    public static void main(String[] args) {

        PrimePrinter obj = new PrimePrinter();

        Thread t = new Thread(obj);

        t.start();
    }
}