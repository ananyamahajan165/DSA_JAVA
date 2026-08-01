import java.util.*;

public class Collectors2 {

    static void removeKeyword(ArrayList<String> list, String key) {

        list.removeIf(str -> str.contains(key));

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        String key = sc.next();

        removeKeyword(list, key);
    }
}