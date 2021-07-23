/*
 * @lc app=leetcode.cn id=1893 lang=java
 *
 * [1893] 检查是否区域内所有整数都被覆盖
 */

// @lc code=start
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i][0] <= left && ranges[i][1] >= left) {
                if (ranges[i][1] >= right) {
                    return true;
                } else {
                    left = ranges[i][1] + 1;
                    i = -1;
                }
            }
        }
        return false;
    }
}
// @lc code=end
