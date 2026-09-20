// Runtime 12 ms Beats 63.54% 
// Memory 47.15 MB Beats 66.51%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int passwordStrength(String password) {
        int ret = 0;
        HashSet<Character> dup = new HashSet<>();
        for (char c : password.toCharArray()) {
            if (dup.contains(c)) {
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                ret += 1;
            } else if (c >= 'A' && c <= 'Z') {
                ret += 2;
            } else if (c >= '0' && c <= '9') {
                ret += 3;
            } else if ("!@#$".contains(String.valueOf(c))) {
                ret += 5;
            }

            dup.add(c);
        }

        return ret;
    }
}
