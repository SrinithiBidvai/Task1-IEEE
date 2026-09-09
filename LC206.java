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
    public ListNode reverseList(ListNode head) {
        ListNode a=head;
        ListNode nex;
        ListNode prev=null;
        while (a!=null){
            nex=a.next;
            a.next=prev;
            prev=a;
            a=nex;
        }
        return prev;

            
        
    }
}