class Solution {
    public long countCommas(long n) {
        long num=1000;
        long res=0;
        while(num<=n){
            res+=n-num+1;
            num*=1000;
        }
        return res;
    }
}