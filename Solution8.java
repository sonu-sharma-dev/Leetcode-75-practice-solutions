public class Solution8 {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
