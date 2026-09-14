class EvenThread extends Thread {

    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(getName() + " : " + i);
        }
    }
}

class OddThread extends Thread {

    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class threads2 {
    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.setName("Even");
        odd.setName("Odd");

        even.start();
        odd.start();
    }
}