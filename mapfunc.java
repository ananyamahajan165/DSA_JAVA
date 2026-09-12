import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapfunc {
    public static void main(String[] args) {
        
    List<String> names = Arrays.asList("Ananya", "Rahul", "Aman");

List<String> upperNames = names.stream()
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(upperNames);
}
}
