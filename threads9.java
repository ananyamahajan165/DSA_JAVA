class Message implements Runnable {

    public void run() {

        String[] messages = {
            "Welcome",
            "to",
            "Java",
            "Multithreading"
        };

        for (String msg : messages) {

            System.out.println(msg);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class threads9 {
    public static void main(String[] args) {

        Message obj = new Message();

        Thread t = new Thread(obj);

        t.start();
    }
}