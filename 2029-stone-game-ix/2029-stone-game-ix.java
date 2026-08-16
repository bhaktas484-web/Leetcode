class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i : stones) {
            if (i % 3 == 0) {
                a++;
            }
            else if (i % 3 == 1) {
                b++;
            }
            else {
                c++;
            }
        }
        if (a % 2 == 0) {
            return b > 0 && c > 0;
        }
        return Math.abs(b - c) > 2;
    }
}