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
class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head2=l2,lastNode=null;
        while(l1!=null && l2!=null){
            l2.val+=l1.val+carry;
            carry=l2.val/10;
            l2.val%=10;
            
            if(l2.next==null){
                lastNode=l2;  
            }
            l2=l2.next;
            l1=l1.next;

        }
        if(l1!=null)
            lastNode.next=l1;
        while(l1!=null && carry!=0){
            l1.val+=carry;
            carry=l1.val/10;
            l1.val%=10;
            lastNode=l1;
            l1=l1.next;
        }
        while(l2!=null && carry!=0){
            l2.val+=carry;
            carry=l2.val/10;
            l2.val%=10;
            lastNode=l2;
            l2=l2.next;
        }
        if(carry!=0){
            lastNode.next=new ListNode(carry);
        }
        return head2;
    }
}