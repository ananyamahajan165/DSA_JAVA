class Task extends Thread { 
    public void run() {
try {
Thread.sleep(500);
} catch (Exception e) { 
    System.out.println(e);
}
}
}

public class t2 {
public static void main(String[] args) throws Exception {

Task t = new Task(); 
System.out.println(t.getState());
t.start(); 
System.out.println(t.getState());
t.join(); 
System.out.println(t.getState());
}
}
