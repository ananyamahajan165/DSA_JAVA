import java.util.ArrayList;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int div = sc.nextInt();
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%div==0){
                list.remove(i);
            }
        }
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));

                if(i < list.size()-1){
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
}
