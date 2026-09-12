import java.util.HashSet;

public class UniIntersect {
    static void UnionInter(int a[],int b[]){
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int i=0;i<a.length;i++){
            union.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(union.contains(b[i])){
                intersect.add(b[i]);
            }
            else{
                union.add(b[i]);
            }
        }
    }
}
