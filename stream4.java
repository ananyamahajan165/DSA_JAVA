import java.util.Arrays;
import java.util.List;

public class stream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,6,7,8,9);
        list.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
    }
}
