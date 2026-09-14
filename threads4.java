class ThreadOne extends Thread {

    public void run() {

        for (char ch = 'A'; ch <= 'M'; ch++) {
            System.out.println("T1 : " + ch);
        }
    }
}

class ThreadTwo extends Thread {

    public void run() {

        for (char ch = 'N'; ch <= 'Z'; ch++) {
            System.out.println("T2 : " + ch);
        }
    }
}

public class threads4 {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }
}