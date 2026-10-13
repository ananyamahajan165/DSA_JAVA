import java.util.Scanner;

class TicketProcessor extends Thread{
    int tickets;
    TicketProcessor(int tickets){
        this.tickets = tickets;
    }
    public void run(){
        System.out.println("Ticket Processed: "+tickets);
    }
}
public class test49 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TicketProcessor t = new TicketProcessor(n);
        t.start();
        t.join();
        System.out.println("Completed");
        sc.close();
    }
}
