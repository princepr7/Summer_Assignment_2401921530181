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
    public TreeNode resultant(int[] preorder,int[] inorder,int prelo,int prehi,int inlo,int inhi){
        if(prelo>prehi||inlo>inhi) return null;
        TreeNode root=new TreeNode(preorder[prelo]);
        int target=preorder[prelo];
        int count=1;
        while(inorder[inlo+count-1]!=target) count++;
        root.left=resultant(preorder,inorder,prelo+1,prelo+count-1,inlo,inlo+count-2);
        root.right=resultant(preorder,inorder,prelo+count,prehi,inlo+count,inhi);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return resultant(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
}
