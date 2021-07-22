import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 */

// @lc code=start

// Definition for a Node.
// class Node {
//     int val;
//     Node next;
//     Node random;

//     public Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.random = null;
//     }
// }


class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node ptr = head;
        Map<Node, Node> map = new HashMap<>();
        while (ptr != null) {
            map.put(ptr, new Node(ptr.val));
            ptr = ptr.next;
        }
        ptr = head;
        while (ptr != null) {
            map.get(ptr).next = map.get(ptr.next);
            map.get(ptr).random = map.get(ptr.random);
            ptr = ptr.next;
        }

        return map.get(head);
    }


}
// @lc code=end

