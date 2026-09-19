import java.util.*;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            int quantity = sc.nextInt();
        map.put(id,quantity);
        }
        int m = sc.nextInt();
        int total =0;
        for(int i=0;i<m;i++){
            int id = sc.nextInt();
            if(map.containsKey(id)){
                total+=map.get(id);
            }
        }
        System.out.println(total);
        sc.close();
    }
}