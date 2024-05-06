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
    public ListNode removeNodes(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode flag = removeNodes(temp.next);
        temp.next = flag;
        if(flag == null || temp.val >= flag.val) return temp;
        return flag;
    }
}