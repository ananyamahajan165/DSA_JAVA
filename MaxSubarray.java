import java.util.Scanner;
public class MaxSubarray {
    static int maxsubarray(int nums[]){
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print(maxsubarray(arr)+" ");
        scn.close();
    }
}
