// Runtime 1 ms Beats 99.07% 
// Memory 42.90 MB Beats 5.80%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public boolean consecutiveSetBits(int n) {
        int lastDigit = -1, count = 0;
        while (n > 0) {
            int digit = n % 2;
            if (digit == 1 && lastDigit == 1) {
                count++;
            }
            lastDigit = digit;
            n /= 2;
        }

        return count == 1;
    }
}

