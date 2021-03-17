/*
 * @lc app=leetcode.cn id=115 lang=java
 *
 * [115] 不同的子序列
 */

// @lc code=start

/*
 * 显而易见的一道动规题目:
 * dp[i][j]: 从 s 开头到 s[i - 1] 中有多少个 t 到 t[j - 1] 的子串
 * 很容易可以得到状态转换方程:
 * if (s[i - 1] == t[j - 1]) {
 *      dp[i][j] = dp[i - 1][j]
 * }
 * if (s[i - 1] == t[j - 1]) {
 *      dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
 * }
 */
class Solution {
    public int numDistinct(String s, String t) {
        final int sLen = s.length(), tLen = t.length();
        int[][] dp = new int[sLen + 1][tLen + 1];
        for (int i = 0; i < sLen + 1; ++i) {
            for (int j = 0; j < tLen + 1; ++j) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = 0;
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[sLen][tLen];
    }
}
// @lc code=end
