import java.util.Scanner;
import java.util.Vector;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>();
        for(int i=0;i<n;i++){
            v.add(sc.nextInt());
        }
        int exist = sc.nextInt();
        int newId = sc.nextInt();
        int index = v.indexOf(exist);
        if(index == -1){
            System.out.println("Not found");
        }else{
            v.add(index+1,newId);
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i));
                if(i<v.size()-1){
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
}
