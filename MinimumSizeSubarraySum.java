public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j];

            if (sum < target) {
                j++;
            } else {
                while (sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                    sum -= nums[i];
                    i++;
                }
                j++;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLen(target, nums)); // Output: 2
    }
}