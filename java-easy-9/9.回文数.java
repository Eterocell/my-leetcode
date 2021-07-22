/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String orig = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(orig);
        stringBuilder.reverse();
        String reversed = stringBuilder.toString();
        if (reversed.equals(orig)) {
            return true;
        } else {
            return false;
        }
    }
}
// @lc code=end

