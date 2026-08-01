import java.util.*;
import java.util.Scanner;

public class CharacterFreq {
    static void charFrequency(String str) {
       HashMap<Character, Integer> map = new HashMap<>();
    // str=str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (map.containsKey(ch))
            map.put(ch, map.getOrDefault(ch,0) + 1);
        else
            map.put(ch, 1);
    }
    for (Character key : map.keySet()) {
        System.out.println(key + " -> " + map.get(key));
        }
    }
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        charFrequency(str);
        sc.close();
}
}