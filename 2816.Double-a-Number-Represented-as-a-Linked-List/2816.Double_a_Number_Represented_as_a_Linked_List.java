import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode temp = new ListNode();
        ListNode p = head;
        StringBuilder sb = new StringBuilder();
        while(p != null) {
            sb.append(p.val);
            p = p.next;
        }
        BigInteger a = new BigInteger(sb.toString());
        a = a.multiply(BigInteger.valueOf(2));
        sb = new StringBuilder(a.toString());
        int i = 0;
        head = temp;
        while(i < sb.length()) {
            temp.val = Integer.parseInt(String.valueOf(sb.charAt(i)));
            if(i != sb.length() - 1) temp.next = new ListNode();
            temp = temp.next;
            i++;
        }
        return head;
    }
}