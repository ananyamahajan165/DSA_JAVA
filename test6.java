import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                int temp=arr[i];
                for (int j = i; j > pos; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[pos]=temp;
                pos++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
