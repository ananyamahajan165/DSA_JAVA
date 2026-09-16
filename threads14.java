class SumThread implements Runnable {

    int start;
    int end;
    String name;

    SumThread(int start, int end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public void run() {

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }

        System.out.println(name + " = " + sum);
    }
}

public class threads14 {
    public static void main(String[] args) {

        SumThread obj1 = new SumThread(1, 100, "Sum1");
        SumThread obj2 = new SumThread(101, 200, "Sum2");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}