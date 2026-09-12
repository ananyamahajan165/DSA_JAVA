import java.util.*;

public class onesOnRight {
    static void ones(int n[]){
        int index=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                int temp=n[index];
                n[index]=n[i];
                n[i]=temp;
                index++;
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n[]= new int[a];
        for(int i=0;i<a;i++){
            n[i]=scn.nextInt();
        }
        ones(n);
        scn.close();
    }
}
