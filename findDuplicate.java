import java.util.*;

public class findDuplicate {

    static void findDuplicates(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            else
                map.put(arr[i], 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1)
                System.out.println(key + " -> " + map.get(key));
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findDuplicates(arr);
        sc.close();
    }
}