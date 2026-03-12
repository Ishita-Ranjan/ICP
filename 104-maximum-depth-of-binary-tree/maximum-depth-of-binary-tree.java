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
        if(root==null) return 0;
        List<List<Integer>> list=new ArrayList<>();
        level(root,list);
        int n=list.size();
        return n;
    }
    public List<List<Integer>> level(TreeNode root, List<List<Integer>> list){
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ll=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                int value=node.val;
                ll.add(value);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(ll);
        }
        return list;
    }
}