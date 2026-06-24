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

//Method-1 TC-O(n*h) SC-O(h) where h can be logn or n

// class Solution {
//     private long minValue(TreeNode root){
//         if(root==null) return Long.MAX_VALUE;
//         int val=root.val;
//         return Math.min(val,Math.min(minValue(root.left),minValue(root.right)));
//     }
//     private long maxValue(TreeNode root){
//         if(root==null) return Long.MIN_VALUE;
//         int val=root.val;
//         return Math.max(val,Math.max(maxValue(root.left),maxValue(root.right)));
//     }
//     public boolean isValidBST(TreeNode root) {
//         if(root==null) return true;
//         long maxLST=maxValue(root.left);
//         long minRST=minValue(root.right);
//         if(root.val<=maxLST || root.val>=minRST) return false;
//         return isValidBST(root.left) && isValidBST(root.right);
//     }
// }



//Method-2 by checking whether inorder is sorted or not TC-O(n) SC(n)
// class Solution {
//     private void Inorder(TreeNode root, List<Integer> arr){
//         if(root==null) return;
//         Inorder(root.left, arr);
//         arr.add(root.val);
//         Inorder(root.right, arr);
//     }
//     public boolean isValidBST(TreeNode root) {
//         List<Integer> arr=new ArrayList<>();
//         Inorder(root, arr);
//         boolean flag=true;
//         for(int i=1;i<arr.size();i++){
//             if(arr.get(i)<=arr.get(i-1)){ flag=false; break;}
//         }
//         return flag;
//     }
// }


//same as Method-2 without storing element in array just by comparing with previous TC-O(n) SC(1) Concept used: for every node, node.val>max(LST) and node.val<min(LST)
class Solution {
    private boolean Inorder(TreeNode root, long[] prev){
        if(root==null) return true;;
        boolean left=Inorder(root.left, prev);
        if(root.val<=prev[0]) return false;
        prev[0]=root.val;
        boolean right=Inorder(root.right, prev);
        return left && right;
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        return Inorder(root, new long[] {Long.MIN_VALUE});
    }
}
