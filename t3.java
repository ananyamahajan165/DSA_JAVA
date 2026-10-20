import java.util.concurrent.*;

public class t3 {
public static void main(String[] args) throws Exception {

ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

Thread t1 = new Thread(() -> { 
    for (int i = 1; i <= 5; i++)
        map.put(i, "A");
});

Thread t2 = new Thread(() -> { 
    for (int i = 6; i <= 10; i++)
        map.put(i, "B");
});

t1.start();
t2.start();

t1.join();
t2.join();

System.out.println(map);
}
}