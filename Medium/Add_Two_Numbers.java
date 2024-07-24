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
import java.lang.Math;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int digit;
        ListNode start = new ListNode(0);
        ListNode newNode = start;
        ListNode nextNode;
        while(l1.next!=null || l2.next!=null){
            if(l1.next==null)
                l1.next = new ListNode(0);
            if(l2.next==null)
                l2.next = new ListNode(0);
            digit = l1.val + l2.val+carry;
            carry = digit/10;
            nextNode = new ListNode(digit%10);
            newNode.next = nextNode;
            newNode = newNode.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        digit = l1.val + l2.val+carry;
        carry = digit/10;
        nextNode = new ListNode(digit%10);
        newNode.next = nextNode;
        newNode = newNode.next;
        if(carry==1){
            if(l1.next==null)
                l1.val=0;
            if(l2.next==null)
                l2.val=0;
            digit = l1.val + l2.val+carry;
            carry = digit/10;
            nextNode = new ListNode(digit%10);
            newNode.next = nextNode;
            newNode = newNode.next;
            
        }

        start=start.next;
        return start;
    }
}

/*
Do not convert list to number and convert sum to linked list
Storing large numbers will be difficult */