import java.util.ArrayList;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(70);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(10);
        l.add(60);
        l.add(50);
        // l.stream().filter(x->x>20).forEach(System.out::println);
        // l.stream().map(x->x*x).forEach(System.out::println);
        // l.stream().distinct().forEach(System.out::println);
        // l.stream().sorted().forEach(System.out::println);
        // l.stream().limit(3).forEach(System.out::println);
        System.out.println(l.stream().filter(x->x>20).collect(Collectors.toList()));
        System.out.println(l.stream().count());
    }
}
