import java.util.HashSet;
import java.util.Scanner;

public class RemoveDUP {
    static String removeDuplicates(String str){
        HashSet<Character> set = new HashSet<>();
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                ans+=ch;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
    }
}
