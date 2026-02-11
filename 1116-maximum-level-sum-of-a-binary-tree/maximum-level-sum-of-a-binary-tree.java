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
    public int maxLevelSum(TreeNode root) {
        int maxi=Integer.MIN_VALUE;
        int maxl=0;
        int level=0;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode nn=q.poll();
                int data=nn.val;
                sum+=data;
                if(nn.left!=null){
                    q.add(nn.left);
                }
                if(nn.right!=null){
                    q.add(nn.right);
                }
            }
            level++;
            if(sum>maxi){
                maxi=sum;
                maxl=level;
            }
        }
        return maxl;
    }
}