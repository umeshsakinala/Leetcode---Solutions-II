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
    public void reorderList(ListNode head) {
        LinkedList ll = new LinkedList<Integer>();
        LinkedList ll2 = new LinkedList<Integer>();
        ListNode p = head;
        ListNode q = head;
        int count = 0;
        while(q != null && q.next != null) {
            p = p.next;
            count++;
            q = q.next.next;
        }
        q = p.next;
        p = head;
        for(int i=0; i<count; i++) {
            ll.add(p.val);
            if(p != null) p = p.next;
        }
        while(q != null) {
            ll2.add(q.val);
            if(q != null) q = q.next;
        }
        Collections.reverse(ll2);
        int i = 0;
        ListNode ans = head;
        while(i < ll.size() && i<ll2.size()) {
            ans.val = (int)ll.get(i);
            ans = ans.next;
            ans.val = (int)ll2.get(i);
            ans = ans.next;
            i++;
        }
    }
}