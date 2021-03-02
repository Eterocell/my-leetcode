import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * 哈希表
         */
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] { hashMap.get(target - nums[i]), i };
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];

        /*
         * 暴力解法
         */
        // for (int i = 0; i < nums.length - 1; ++i) {
        // for (int j = i + 1; j < nums.length; ++j) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j };
        // }
        // }
        // }
        // return new int[0];
    }
}
// @lc code=end

