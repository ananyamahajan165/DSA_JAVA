import java.util.*;

public class t1 {
public static void main(String[] args) { 
    List<Integer> numbers = Arrays.asList(2, 3, 2, 4, 3, 2, 5); 
    Map<Integer, Integer> frequency = new HashMap<>();
    for(int n: numbers){
        frequency.put(n,frequency.getOrDefault(n,0)+1);
    }

// System.out.println(frequency);
    for (int key : frequency.keySet()) {
    System.out.println(key + " " + frequency.get(key));
    }
}
}