class Solution {
    public List<Integer> generaterow(int n) {
        List<Integer> ansrow = new ArrayList<>();
        long ans = 1; 
        ansrow.add((int) ans);
        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1);
            ans = ans / i;
            ansrow.add((int) ans);
        }
        return ansrow;
    }
    public List<Integer> getRow(int rowIndex) {
       return generaterow(rowIndex);
}
}