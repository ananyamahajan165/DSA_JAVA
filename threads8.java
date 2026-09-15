class Worker extends Thread {

    public void run() {

        Thread t = Thread.currentThread();

        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("State: " + t.getState());
    }
}

public class threads8 {
    public static void main(String[] args) {

        Worker t = new Worker();

        t.setName("Worker");
        t.setPriority(Thread.MAX_PRIORITY);

        t.start();
    }
}