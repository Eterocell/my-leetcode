/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
import java.math.BigDecimal;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode(0);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ListNode ptr = solution;
        while (l1 != null) {
            sb1.append(Integer.toString(l1.val));
            l1 = l1.next;
        }
        while (l2 != null) {
            sb2.append(Integer.toString(l2.val));
            l2 = l2.next;
        }
        BigDecimal b1 = new BigDecimal(sb1.reverse().toString());
        BigDecimal b2 = new BigDecimal(sb2.reverse().toString()).add(b1);
        String solutionStr = b2.toString();
        for (int i = solutionStr.length() - 1; i >= 0; --i) {
            ListNode tmp = new ListNode(solutionStr.charAt(i) - '0');
            ptr.next = tmp;
            ptr = tmp;
        }
        return solution.next;
    }

    /*
     * ListNode Definitions Here
     */
    // class ListNode {
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
}
// @lc code=end
