import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
        }
        double avg = (double) sum/n;
        System.out.println(sum);
        System.out.printf("%.2f" , avg);
        System.out.println();
        System.out.println(max-min);
        sc.close();
    }
}