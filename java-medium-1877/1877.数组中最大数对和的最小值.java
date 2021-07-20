/*
 * @lc app=leetcode.cn id=1877 lang=java
 *
 * [1877] 数组中最大数对和的最小值
 */
// @lc code=start
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int flag = 0;
        for (int i = 0; i < len / 2; ++i) {
            int tmp = nums[i] + nums[len - i - 1];
            if (flag < tmp) {
                flag = tmp;
            }
        }
        return flag;
    }
}
// @lc code=end
