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
    public int maxDepth(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        levelOrder(root,list);
        int n=list.size();
        return n;
    }
    public List<List<Integer>> levelOrder(TreeNode root,List<List<Integer>> list) {
        if (root == null) return list;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode nn=q.poll();
                int ele = nn.val;
                ans.add(ele);
            
                if(nn.left!=null){
                    q.add(nn.left);
                }
                if(nn.right!=null){
                    q.add(nn.right);
                }
            }
            list.add(ans);
        }
        return list;
    }
}