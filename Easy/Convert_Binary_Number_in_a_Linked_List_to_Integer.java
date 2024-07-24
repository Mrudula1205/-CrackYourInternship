import java.lang.Math;
class Solution {
    public int getDecimalValue(ListNode head) {
        int count=0, num=0;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        for(int i=count; i>=0; i--){
            num = num + ((int)(Math.pow(2,i))*(head.val));
            head=head.next;
        }
        return num;
    }
}
