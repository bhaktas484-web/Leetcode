class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0;
        int n=nums.length;
        boolean nonzero=false;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
            if(nums[i]!=0){
                nonzero=true;
            }
        }
        if(x!=0){
            return n;
        }
        if(nonzero){
            return n-1;
        }
        return 0;
    }
}