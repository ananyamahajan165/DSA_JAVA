public class FindKthRotation {
    public int findKRotation(int arr[]) {
        int s=0,e=arr.length-1;
        if(arr[s]<=arr[e]) return 0;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[e]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return s;
    }
}
