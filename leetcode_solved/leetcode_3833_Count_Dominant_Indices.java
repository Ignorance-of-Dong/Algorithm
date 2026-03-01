// Runtime 1 ms Beats 100.00% 
// Memory 46.54 MB Beats 22.61%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int dominantIndices(int[] nums) {
        int len = nums.length, ret = 0;
        long sum = nums[len - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (sum / (len - 1 - i) < nums[i]) {
                ret++;
            }
            sum += nums[i];
        }

        return ret;
    }
}
