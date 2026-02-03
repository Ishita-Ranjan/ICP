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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int[] arr=new int[list.size()];
        Stack<Integer> st=new Stack<>();
        for(int i=list.size()-1;i>=0;i--){
            while(!st.empty() && list.get(i)>=st.peek()){
                st.pop();
            }
            if(st.empty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(list.get(i));
        }
        return arr;
    }
}