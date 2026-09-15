class StarPrinter implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }
    }
}

class HashPrinter implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("#####");
        }
    }
}

public class threads11 {
    public static void main(String[] args) {

        StarPrinter star = new StarPrinter();
        HashPrinter hash = new HashPrinter();

        Thread t1 = new Thread(star);
        Thread t2 = new Thread(hash);

        t1.start();
        t2.start();
    }
}