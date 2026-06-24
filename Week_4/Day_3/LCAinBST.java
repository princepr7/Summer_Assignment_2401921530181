/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// class Solution {
//     private TreeNode findLCA(TreeNode root,TreeNode p,TreeNode q){
//         if(root.val>=p.val && root.val<=q.val) return root;
//         else if(p.val>root.val && q.val>root.val) return findLCA(root.right,p,q);
//         else return findLCA(root.left,p,q);
//     }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(p.val<q.val) return findLCA(root,p,q);
//         return findLCA(root,q,p);   
//     }
// }

//METHOD-2
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
//         else if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);
//         else return root;   
//     }
// }


// class Solution {
//      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//             if(root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left,p,q);
//             else if(root.val<p.val && root.val<q.val) return lowestCommonAncestor(root.right,p,q);
//             else return root;//if root.val>p && root.val<q or vice verca or if root.val==p or if root.val==q
//      }
// }


class Solution {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        else if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        else return root;//if( p.val>root.val && q.val<root.val) || its vice verca || if root.val==p.val || root.val==q.val
    }
}
