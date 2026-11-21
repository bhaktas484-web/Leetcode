class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            int n = s.length() % k;
            StringBuilder nextS = new StringBuilder();
            
            // 1. Handle all full groups of size k
            int sum1 = 0;
            for (int i = 0; i < s.length() - n; i++) {
                sum1 += s.charAt(i) - '0';
                
                // Every time we hit k digits, save the sum and reset
                if ((i + 1) % k == 0) {
                    nextS.append(sum1);
                    sum1 = 0;
                }
            }
            
            // 2. Handle the remaining n digits (only if a remainder exists)
            if (n > 0) {
                int sum2 = 0;
                for (int i = s.length() - n; i < s.length(); i++) {
                    sum2 += s.charAt(i) - '0';
                }
                nextS.append(sum2);
            }
            
            // Update s for the next round
            s = nextS.toString();
        }
        
        return s;
    }
}
