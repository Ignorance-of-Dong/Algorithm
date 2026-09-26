// Runtime 4 ms Beats 3.13% 
// Memory 42.84 MB Beats 32.35%
// .
// T:O(logn) S:O(logn)
// 
class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> record = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            record.merge(digit, 1, Integer::sum);
            n /= 10;
        }
        int ret = 0;
        for (int i : record.keySet()) {
            ret += i * record.get(i);
        }

        return ret;
    }
}
