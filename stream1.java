import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Python","Spring","Java", "C++");
        String search = "Java";
        Optional<String> res = list.stream().filter(s->s.equals(search)).findFirst();
        System.out.println(res.orElse("Not found"));
    }
}
