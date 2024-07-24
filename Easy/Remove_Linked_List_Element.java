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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();
        temp.next = head;
        while(temp.next!=null){
            if(temp.next.val==val && head.val==val){
                head=head.next;
            }
            if(temp.next.val==val){
                temp.next=temp.next.next;    
            }
            else
                temp=temp.next;
        }
        
        return head;
    }
}