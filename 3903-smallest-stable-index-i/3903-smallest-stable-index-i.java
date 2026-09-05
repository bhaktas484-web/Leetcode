class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int  min_arr[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i=nums.length - 1; i>= 0; i--){
            min =  Math.min(min, nums[i]);
            min_arr[i] = min;
        }
         int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
           max =  Math.max(max, nums[i]);
           int num = max-min_arr[i];
            if(num<=k){
                return i;
            }
        }
        return -1;
    }
}