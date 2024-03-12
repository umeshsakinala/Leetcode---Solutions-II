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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        HashMap<Integer, ListNode> mp = new HashMap<>();
        int prefixSum = 0;
        mp.put(prefixSum, temp);
        while(head != null) {
            prefixSum = prefixSum + head.val;
            mp.put(prefixSum, head);
            head = head.next;
        }
        head = temp;
        prefixSum = 0;
        while(head != null) {
            prefixSum = prefixSum + head.val;
            head.next = mp.get(prefixSum).next;
            head = head.next;
        }
        head = temp.next;
        return head;
    }
}