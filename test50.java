import java.util.*;

class OrderProcessor extends Thread {

    int orderId;

    OrderProcessor(int orderId) {
        this.orderId = orderId;
    }
    public void run() {
        System.out.println("Order " + orderId + " Processing");
    }
}

public class test50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int orderId = sc.nextInt();
        OrderProcessor t = new OrderProcessor(orderId);

        t.start();
        sc.close();
    }
}