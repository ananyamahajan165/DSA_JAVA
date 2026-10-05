    import java.util.*;

public class test33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
         for(int i=0;i<list.size();i++){
            int val = list.get(i)*2+(10);
            System.out.print(val +" ");
        }
        sc.close();

        //  list.forEach(x -> System.out.print((x * 2 + 10) + " "));
    }
}