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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dia(root);
        return dia;
    }
    public int dia(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=dia(root.left);
        int right=dia(root.right);
        dia=Math.max(left+right,dia);
        return Math.max(left,right)+1;
    }
}