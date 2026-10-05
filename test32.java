import java.util.*;

public class test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextDouble());
        }
        for(int i=0;i<list.size();i++){
            double increasedValue = list.get(i) * 1.10;
            System.out.printf("%.2f ", increasedValue);
        }
        sc.close();

        // list.stream()
        //         .map(x -> x * 1.10)
        //         .forEach(x -> System.out.printf("%.2f ", x));
    }
}
