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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            n++;
        }
        n = n/2;
        temp = head;
        int count = 0;
        while(count != n) {
            temp = temp.next;
            count++;
        }
        return temp;
    }
}