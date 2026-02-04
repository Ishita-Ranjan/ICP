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
    public ListNode doubleIt(ListNode head) {
        ListNode rev=reverse(head);
        ListNode temp=rev;
        int carry=0;
        while(temp!=null){
            int val=temp.val*2+carry;
            int rem=val%10;
            carry=val/10;
            temp.val=rem;
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        if(carry!=0){
            ListNode nn=new ListNode(carry);
            temp.next=nn;
        }
        return reverse(rev);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode curr;
        while(temp!=null){
            curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        } 
        return prev;
    }
}