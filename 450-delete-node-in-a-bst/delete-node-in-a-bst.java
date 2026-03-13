/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                list.remove(i);
            }
        }
        return tree(list,0,list.size()-1);
    }
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public TreeNode tree(ArrayList<Integer> list,int l, int r){
        if(l>r) return null;
        int mid=l+(r-l)/2;
        TreeNode node=new TreeNode();
        node.val=list.get(mid);
        node.left=tree(list,l,mid-1);
        node.right=tree(list,mid+1,r);
        return node;
    }
}