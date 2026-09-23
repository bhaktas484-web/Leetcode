class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        if(num<16){
        for(int i = 0; i<=num/2; i++){
            if(i*i==num){
                return true;
            }
        }
        }
        for(int i = 0; i<=num/4; i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}