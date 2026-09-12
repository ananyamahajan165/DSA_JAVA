import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stream5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,-3,89,-78);
        Optional<Integer> res = list.stream().filter(n->n<0).findFirst();
        System.out.println(res.orElse(0));
    }
}
