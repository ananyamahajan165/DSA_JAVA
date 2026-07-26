import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max=0,presum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) presum--;
            else{
                presum++;
            }
            if(map.containsKey(presum)){
                max = Math.max(max,i-map.get(presum));
            }
            else{
                map.put(presum,i);
            }
        }
        return max;
    }
}
