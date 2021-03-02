import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */

// @lc code=start
/*
 * 因为要多次调用 sumRange(), 考虑直接算出对于数组内每个元素的前 n 项之和.
 */
class NumArray {
    private final int[] sumsSeq;

    public NumArray(int[] nums) {
        sumsSeq = new int[nums.length + 1];
        Arrays.fill(sumsSeq, 0);

        for (int i = 0; i < nums.length; ++i) {
            sumsSeq[i + 1] = nums[i] + sumsSeq[i];
        }
    }

    public int sumRange(int i, int j) {
        return sumsSeq[j + 1] - sumsSeq[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */
// @lc code=end
