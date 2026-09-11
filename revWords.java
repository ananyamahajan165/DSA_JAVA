import java.util.*;
public class revWords {
    static String reverseWords(String str) {
        String words[] = str.split("\\s+");
        String ans = "";
        for (int i = words.length - 1; i >= 0; i--) {
            ans += words[i];
            if (i != 0)
                ans += " ";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
        sc.close();
    }
}

