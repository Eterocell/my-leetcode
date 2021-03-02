/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    // 暴力递归
    // public int fib(int n) {
    // if (n == 1 || n == 2) {
    // return 1;
    // } else {
    // return fib(n - 1) + fib(n - 2);
    // }
    // }

    // 备忘录递归 (使用哈希表, 用数组也可)
    // public int fib(int n) {
    // if (n < 1) {
    // return 0;
    // } else if (n == 1 || n == 2) {
    // return 1;
    // } else {
    // Map<Integer, Integer> hashMap = new HashMap<>() {
    // private static final long serialVersionUID = 1L;
    // {
    // put(1, 1);
    // put(2, 1);
    // }
    // };
    // for (int i = 3; i <= n; ++i) {
    // hashMap.put(i, hashMap.get(i - 1) + hashMap.get(i - 2));
    // }
    // return hashMap.get(n);
    // }
    // }

    // 事实上可以不需要一整个哈希表占用空间, 只留存前两个状态即可.
    public int fib(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int prev = 1, curr = 1;
            for (int i = 3; i <= n; ++i) {
                int tmp = prev + curr;
                prev = curr;
                curr = tmp;
            }
            return curr;
        }
    }

    // 公式法, 斐波那契数列有通项公式可以直接求解
    // 因为斐波那契数其实是齐次线性递推, 可以求得通项公式:
    // F(n) = 1/sqrt(5) (((1+sqrt(5))/2) ^ n - ((1-sqrt(5))/2))
    // public int fib(int n) {
    // double sqrt5 = Math.sqrt(5);
    // double fibN = Math.pow((1 + sqrt5) / 2, n) - Math.pow((1 - sqrt5) / 2, n);
    // return (int) Math.round(fibN / sqrt5);
    // }
}
// @lc code=end
