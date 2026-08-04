class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // int max = nums[0];
        // int min =nums[0];

        // for (int num : nums) {
        // max = Math.max(max, num);
        // min = Math.min(min,num);
        //     }  

        int res[] = new int [nums.length];
        ArrayList<Integer> list = new ArrayList();
        for(int i : nums){
            res[i-1]++;
        }

        for(int i=0; i<res.length; i++){
            if(res[i]==0){
                list.add(i+1);
            }
        }
        return list;
    }
}