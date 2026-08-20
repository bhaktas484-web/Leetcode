class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currmax = nums[0];
        int maxsum = nums[0];
        int currmin = nums[0];
        int minsum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (i > 0) {
                currmax = Math.max(nums[i], currmax + nums[i]);
                maxsum = Math.max(maxsum, currmax);

                currmin = Math.min(nums[i], currmin + nums[i]);
                minsum = Math.min(minsum, currmin);
            }
        }
        if (maxsum < 0) {
            return maxsum;
        }
        int circularmax = total - minsum;
        return Math.max(maxsum, circularmax);
    }
}