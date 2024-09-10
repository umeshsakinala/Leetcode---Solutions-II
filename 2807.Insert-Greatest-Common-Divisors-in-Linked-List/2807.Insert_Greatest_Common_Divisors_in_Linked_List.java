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
    public int GCD(int a, int b) {
        if(a == 1 || b == 1) return 1;
        while(b != 0) {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p = head;
        ListNode ans = p;
        while(p != null && p.next != null) {
            int a = p.val;
            int b = p.next.val;
            int c = GCD(a, b);
            ListNode temp = p.next;
            p.next = new ListNode(c);
            p = p.next;
            p.next = temp;
            p = p.next;
        }
        return ans;
    }
}