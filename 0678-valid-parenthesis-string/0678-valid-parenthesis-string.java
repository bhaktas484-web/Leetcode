class Solution {
    public boolean checkValidString(String s) {
        int l = 0, h = 0;
        for (int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i)=='('){
                l+=1;
            }
            else{
                l+=-1;
            }

            if(s.charAt(i)==')'){
                h+=-1;
            }
            else{
                h+=1;
            }

            if (h < 0) return false;

            l = Math.max(l, 0);
        }
        return l == 0;
    }
}