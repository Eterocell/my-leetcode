/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start

//  Definition for singly-linked list.
// public class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode front = head, chase = head, flag = head;

        int counter = 1;
        while (front.next != null) {
            counter++;
            front = front.next;
            if (counter > n + 1) {
                chase = chase.next;
            }
        }

        if (n == counter) {
            return head.next;
        }

        if (n == 1) {
            chase.next = null;
        } else {
            chase.next = chase.next.next;
        }

        return head;
    }
}
// @lc code=end
