class Solution {
    private int count(int num) {
        int sum = 0;
        while(num > 0) {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
    
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) arr[i] = i;
        Arrays.sort(arr, (a,b)->{
            int ct1 = count(nums[a]), ct2 = count(nums[b]);
            if(ct1 == ct2) return nums[a]-nums[b];
            return ct1-ct2;
        });

        int ct = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){ 
            map.put(arr[i], i);
        }

        for(int i=0; i<n; i++) { 
            if(i != map.get(i)) {
                int currval = arr[i], i_idx = map.get(i);
                map.put(currval, i_idx);
                arr[i_idx] = currval;
                ct++;
            }
            
        }
        return ct;
    }
}