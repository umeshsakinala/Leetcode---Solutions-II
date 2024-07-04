/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode answer = new ListNode();
        ListNode current = answer;
        ListNode p = head.next;
        ListNode q = head.next;
        while(q != null) {
            while(q != null && q.val != 0) q = q.next;
            int sum = 0;
            while(p != q) {
                sum = sum + p.val;
                p = p.next;
            }
            if(q != null) {
                ListNode newNode = new ListNode(sum);
                current.next = newNode;
                current = current.next;
                q = q.next;
                p = q;
            }
        }
        return answer.next;
    }
}