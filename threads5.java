class TableThread extends Thread {

    int number;

    TableThread(int number) {
        this.number = number;
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}

public class threads5 {
    public static void main(String[] args) {

        TableThread t1 = new TableThread(7);
        TableThread t2 = new TableThread(5);

        t1.start();
        t2.start();
    }
}