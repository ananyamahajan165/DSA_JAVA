import java.util.*;
public class test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextDouble());
        }

        list.stream().map(x->{
            if(x>=1000){
                return x*0.85;
            }else{
                return x*0.95;
            }
        }).map(Math::round).forEach(x->System.out.print(x+" "));
        sc.close();
    }
}