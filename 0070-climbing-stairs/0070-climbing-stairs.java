class Solution {
    public int climbStairs(int n) {
        int a = 1,b=1,i=0;
        while(i<n-1){
            int temp = a;
            a = a+b;
            b = temp;
            i++;
        }
        return a;
    }
}