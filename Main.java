
import java.util.*;
public class Main {
    static boolean isPalindrome(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        if (isPalindrome(list))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
