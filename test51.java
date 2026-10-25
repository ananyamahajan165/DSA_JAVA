import java.util.*;

class HeartRateMonitor implements Runnable {

    private int[] readings;
    HeartRateMonitor(int[] readings) {
        this.readings = readings;
    }
    public void run() {
        for (int reading : readings) {
            System.out.println("Monitoring: " + reading);
        }
    }
}

public class test51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] readings = new int[n];
        for (int i = 0; i < n; i++) {
            readings[i] = sc.nextInt();
        }
        HeartRateMonitor monitor = new HeartRateMonitor(readings);

        Thread t = new Thread(monitor);

        t.start();
        sc.close();
    }
}