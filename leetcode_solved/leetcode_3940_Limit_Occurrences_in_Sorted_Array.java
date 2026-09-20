// Runtime 6 ms Beats -% 
// Memory 46.82 MB Beats -%
// Map.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            if (record.getOrDefault(num, 0) >= k) {
                continue;
            }
            record.merge(num, 1, Integer::sum);
        }
        int total = 0;
        for (int num : record.keySet()) {
            total += record.get(num);
        }
        int[] ret = new int[total];
        total = 0;
        for (int num : nums) {
            if (record.get(num) <= 0) {
                continue;
            }
            ret[total++] = num;
            record.merge(num, -1, Integer::sum);
        }

        return ret;
    }
}
