public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int s = 1;
        int e = x;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
