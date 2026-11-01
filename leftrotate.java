
import java.util.Arrays;

public class leftrotate {

    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        leftrotate obj = new leftrotate();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        obj.rotateLeft(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
