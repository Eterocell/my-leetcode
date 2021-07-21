/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode ptrA = headA, ptrB = headB;
        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? (headB) : (ptrA.next);
            ptrB = (ptrB == null) ? (headA) : (ptrB.next);
        }
        return ptrA;
    }
}
// @lc code=end
