/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long rev= 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (int) rev == rev ? (int) rev : 0;
    }
}
// @lc code=end
