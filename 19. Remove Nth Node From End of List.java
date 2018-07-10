/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) return null;
        ListNode curr = head;
        int i=0;
        while(curr!=null){
            i++;
            curr = curr.next;
        }
        //System.out.println(i);
        int index = i-n+1;
        if(index==1) return head.next;
        int j=0;
        curr = head;
        while(curr!=null){
            j++;
            if(j==index-1){
                curr.next = curr.next.next;
            }
            curr= curr.next;
        }
        return head;
    }
}
