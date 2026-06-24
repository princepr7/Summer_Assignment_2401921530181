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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        q.add(root);
        boolean rtl=false;
        while(q.size()!=0){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=1;i<=size;i++) list.add(0);
            int idx=0;
            if(rtl) idx=size-1;
            for(int i=1;i<=size;i++){
                TreeNode front=q.remove();
                if(rtl) list.set(idx--,front.val);
                else list.set(idx++,front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            ans.add(list);
            rtl=!rtl;
        }
        return ans;
    }
}
