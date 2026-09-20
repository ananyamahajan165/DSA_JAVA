import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        double avg = list.stream().mapToInt(x->x).average().orElse(0);
        List<Integer> a  = list.stream().filter(x->x>avg).collect(Collectors.toList());
        if(a.isEmpty()){
            System.out.println(-1);
        }
        else{
            for(int x: a){
                System.out.print(x +" ");
            }
        }
        sc.close();
    } 
}
