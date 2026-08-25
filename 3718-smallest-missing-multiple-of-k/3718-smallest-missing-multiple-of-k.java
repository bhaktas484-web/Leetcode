class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hash = new HashSet<>();
        for (int num : nums) {
            hash.add(num);
        }
        int ans = k;
        while (hash.contains(ans)) {
            ans += k;
        }
        return ans;
    }
}