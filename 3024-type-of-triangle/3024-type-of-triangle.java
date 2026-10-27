class Solution {
    public String triangleType(int[] nums) {
        if(!check(nums)){
         return "none";
        }
        if(nums[0]==nums[1]&&nums[1]==nums[2]){
            return "equilateral";
        }
        else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2]){
            return "isosceles";
        }
        else {
            return "scalene";
        }
    }
    public boolean check(int[]arr){
        int a=arr[0],b=arr[1],c=arr[2];
        if(a+b>c&&b+c>a&&c+a>b){
        return true;
        }
        return false;
    }
}