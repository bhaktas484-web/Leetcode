class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]<10 && nums[i]==i){
                return i;
            }
            else{

            int res = 0;
            int n = nums[i];
                while(n>0){
                    res+=n%10;
                    n=n/10;
                }
                if(res==i){
                    return i;
                }
            }
        }
        return -1;
    }
}