public class FindFirstAndLastPosition {
    
    public int search(int[] arr, int t, int first) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                ans = m;
                if (first == 1) {
                    e = m - 1; 
                } else {
                    s = m + 1;
                }
            } else if (arr[m] > t) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0] = search(nums, target, 1);
        ans[1] = search(nums, target, 2);
        return ans;
    }
}
