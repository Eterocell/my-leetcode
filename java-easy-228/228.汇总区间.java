import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int left = i;
            ++i;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                ++i;
            }
            int right = i - 1;
            StringBuilder builder = new StringBuilder();
            builder.append(Integer.toString(nums[left]));
            if (left < right) {
                builder.append("->");
                builder.append(Integer.toString(nums[right]));
            }
            ret.add(builder.toString());
        }
        return ret;
    }
}
// @lc code=end
