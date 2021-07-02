import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1833 lang=java
 *
 * [1833] 雪糕的最大数量
 */

// @lc code=start
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ret = 0;
        Arrays.sort(costs);
        int arrLen = costs.length;
        for (int i = 0; i < arrLen; i++) {
            if (coins >= costs[i]) {
                ret++;
                coins -= costs[i];
            }
        }
        return ret;
    }
}
// @lc code=end
