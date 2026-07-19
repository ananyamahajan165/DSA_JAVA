import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0;
        int j=0;
        int index=0;
        int n=nums.length;
        int ans[]=new int[n-k+1]; 
        Deque<Integer> dq = new LinkedList<>();
        while(j<n){
            while(!dq.isEmpty() && dq.peekLast()<nums[j]){
                dq.pollLast();
            }
            dq.addLast(nums[j]);
        if(j-i+1<k) j++;
        else if(j-i+1==k){
            ans[index++]=dq.peekFirst();
            if(!dq.isEmpty() && dq.peekFirst()==nums[i]){
                dq.pollFirst();
            }
            i++;j++;
        }
        }
        return ans;
    }
}
