public class t4 {
    static class Counter {
        int count = 0;

        synchronized void increment() {
            count++;
        }
    }

    static class Task extends Thread {
        Counter counter;

        Task(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Task t1 = new Task(c);
        Task t2 = new Task(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
