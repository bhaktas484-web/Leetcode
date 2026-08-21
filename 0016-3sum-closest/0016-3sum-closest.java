class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int closet = nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length; i++){
           
            int j = i+1,k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(sum-target)<Math.abs(closet-target)){
                    closet = sum;
                }
                if(sum>target){
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return closet;
    }
}