public /**
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
   public boolean isPalindrome(ListNode head) {
       Stack<Integer> st = new Stack<Integer>();
       ListNode p = head;
       while(p != null) {
           st.push(p.val);
           p = p.next;
       }
       p = head;
       while(p != null && p.val == st.pop()) {
           p = p.next;
       }
       return p == null;
   }
} {
    
}
