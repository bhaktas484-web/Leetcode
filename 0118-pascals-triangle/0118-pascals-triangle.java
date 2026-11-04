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

    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();
       for (int i = 0; i < numRows; i++) {
           ans.add(generaterow(i));
       } 
       return ans;
    }
}
