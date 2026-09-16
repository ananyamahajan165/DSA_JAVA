class Fibonacci implements Runnable {

    public void run() {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= 15; i++) {

            System.out.println(a);

            int c = a + b;

            a = b;
            b = c;
        }
    }
}

public class threads13 {
    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();

        Thread t = new Thread(obj);

        t.start();
    }
}