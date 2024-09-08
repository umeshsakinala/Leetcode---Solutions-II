class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            len++;
        }
        int div = len / k;
        int rem = len % k;
        ListNode[] result = new ListNode[k];
        ListNode current = head;
        for(int i = 0; i < k; i++) {
            ListNode partHead = current;
            ListNode partTail = null;
            int partSize = div + (i < rem ? 1 : 0);
            for(int j = 0; j < partSize; j++) {
                if(current != null) {
                    partTail = current;
                    current = current.next;
                }
            }
            if(partTail != null) {
                partTail.next = null;
            }
            result[i] = partHead;
        }
        return result;
    }
}
