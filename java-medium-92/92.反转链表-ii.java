/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode solution = new ListNode(0);
        solution.next = head;

        ListNode ptrA = solution;
        ListNode ptrB = solution.next;

        int current = 0;
        while (current < left - 1) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
            current++;
        }

        for (int i = 0; i < right - left; ++i) {
            ListNode tmp = ptrB.next;
            ptrB.next = ptrB.next.next;

            tmp.next = ptrA.next;
            ptrA.next = tmp;
        }

        return solution.next;
    }

    /*
     * ListNode Definitions Here
     */
    // class ListNode {
    // int val;
    // ListNode next;

    // ListNode() {
    // }

    // ListNode(int val) {
    // this.val = val;
    // }

    // ListNode(int val, ListNode next) {
    // this.val = val;
    // this.next = next;
    // }
    // }
}
// @lc code=end
