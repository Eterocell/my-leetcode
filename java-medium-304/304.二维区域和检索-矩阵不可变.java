/*
 * @lc app=leetcode.cn id=304 lang=java
 *
 * [304] 二维区域和检索 - 矩阵不可变
 */

// @lc code=start
/*
 * 思路同 303, 只不过换成了二维区域, 注意这道题有空输入 test case
 */
class NumMatrix {
    private final int[][] sumsMatrix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m > 0) {
            int n = matrix[0].length;
            sumsMatrix = new int[m + 1][n + 1];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    sumsMatrix[i + 1][j + 1] = sumsMatrix[i][j + 1] + sumsMatrix[i + 1][j] - sumsMatrix[i][j]
                            + matrix[i][j];
                }
            }

        } else {
            sumsMatrix = new int[0][0];
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumsMatrix[row2 + 1][col2 + 1] - sumsMatrix[row2 + 1][col1] - sumsMatrix[row1][col2 + 1]
                + sumsMatrix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such: NumMatrix obj
 * = new NumMatrix(matrix); int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end
