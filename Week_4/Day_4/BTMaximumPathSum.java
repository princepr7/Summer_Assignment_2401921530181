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
    int maxi=Integer.MIN_VALUE;
    public int F(TreeNode root){
        if(root==null) return 0;
        int left=F(root.left);
        int right=F(root.right);
        int rtrnRootMax= Math.max(root.val,Math.max(root.val+left,root.val+right));
        maxi=Math.max(maxi,Math.max(rtrnRootMax,root.val+left+right));
        return rtrnRootMax;
    }
    public int maxPathSum(TreeNode root) {
        F(root);
        return maxi;
    }
}
