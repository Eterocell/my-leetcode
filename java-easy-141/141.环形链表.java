/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fore = head, back = head;
        try {
            while (true) {
                fore = fore.next.next;
                back = back.next;
                if (fore == back) {
                    return true;
                }
            }
        } catch(NullPointerException e) {
            return false;
        }
    }
}
// @lc code=end

