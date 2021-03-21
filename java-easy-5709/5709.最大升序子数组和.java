/*
 * @lc app=leetcode.cn id=5709 lang=java
 *
 * [5709] 最大升序子数组和
 */

// @lc code=start
class Solution {
    public int maxAscendingSum(int[] nums) {
        final int NUMSLENGTH = nums.length;
        int ans = nums[0];
        int prev = -1, seq = 0;
        for (int i = 0; i < NUMSLENGTH; ++i) {
            if (nums[i] > prev) {
                seq += nums[i];
            } else {
                seq = nums[i];
            }
            prev = nums[i];
            ans = Math.max(seq, ans);
        }

        return ans;
    }
}
// @lc code=end
