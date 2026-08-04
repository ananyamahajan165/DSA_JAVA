import java.util.HashSet;
public class IsIsogram {
    static boolean isIsogram(String str) {

    HashSet<Character> set = new HashSet<>();

    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if (Character.isLetter(ch)) {

            if (set.contains(ch))
                return false;

            set.add(ch);
        }
    }

    return true;
}
}
