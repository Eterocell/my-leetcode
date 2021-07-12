/*
 * @lc app=leetcode.cn id=275 lang=java
 *
 * [275] H 指数 II
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int arrLen = citations.length;
        int start = 0;
        int end = arrLen - 1;
        int ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int counter = arrLen - mid;
            if (counter <= citations[mid]) {
                ans = counter;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
// @lc code=end

