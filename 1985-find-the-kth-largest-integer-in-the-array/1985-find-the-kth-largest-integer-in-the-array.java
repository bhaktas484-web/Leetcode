import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();

        for (String num : nums) {
            minHeap.offer(new BigInteger(num));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek().toString();
    }
}
