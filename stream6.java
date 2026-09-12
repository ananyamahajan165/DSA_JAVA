    import java.util.*;

public class stream6 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 3);

        nums.sort(Integer::compareTo);

        System.out.println(nums);
    }
}
