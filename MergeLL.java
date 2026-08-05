import java.util.*;
public class MergeLL {
    static LinkedList<Integer> merge(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int i=0,j=0;
        LinkedList<Integer> ans = new LinkedList<>();
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<=l2.get(j)){
                ans.add(l1.get(i));
                i++;
            }
            else{
                ans.add(l2.get(j));
                j++;
            }
        }
        while(i<l1.size()){
            ans.add(l1.get(i++));
        }
        while(j<l2.size()){
            ans.add(l2.get(j++));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        LinkedList<Integer> l1 = new LinkedList<>();
        for (int i = 0; i < n1; i++)
            l1.add(sc.nextInt());
        int n2 = sc.nextInt();
        LinkedList<Integer> l2 = new LinkedList<>();
        for (int i = 0; i < n2; i++)
            l2.add(sc.nextInt());
        System.out.println(merge(l1, l2));
        sc.close();
    }
}
