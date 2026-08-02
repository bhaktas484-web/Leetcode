class Solution {
    public int mostFrequent(int[] nums, int key) {
        int max=0;
        int count[] = new int[1001];
        for (int i=0;i<nums.length-1;i++){
                if(nums[i]==key){
                        count[nums[i+1]]++;
                    }
                }
                int res = 0;
        for(int i=0; i<1001; i++){
            if(max<count[i]){
             max=count[i];
             res = i;
        }
    }
    return res;
    }
}
