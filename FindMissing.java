public class FindMissing {
    static int findMissing(int arr[], int n) {
    int total = n * (n + 1) / 2;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return total - sum;
}
public static void main(String[] args) {
    
}
}
