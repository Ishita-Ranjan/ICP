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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int c=-1;
        int ans=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int val=temp.val;
            ans+=val*pow(2,c);
            c--;
            temp=temp.next;
        }
        return ans;
    }
    public int pow(int x,int y){
        int power=1;
        while(y>0){
            power*=x;
            y--;
        }
        return power;
    }
}