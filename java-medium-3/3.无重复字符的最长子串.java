import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }

        Set<Character> set = new HashSet<>();
        int ans = 0;
        int right = -1;

        for (int i = 0; i < len; ++i) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (right + 1 < len && !set.contains(s.charAt(right + 1))) {
                set.add(s.charAt(right + 1));
                right++;
            }
            if (ans < right - i + 1) {
                ans = right - i + 1;
            }
        }

        return ans;
    }
}
// @lc code=end
