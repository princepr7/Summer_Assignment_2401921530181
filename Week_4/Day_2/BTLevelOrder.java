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

 //BY DFS METHOD
// class Solution {
//     private int cntLevel(TreeNode root){
//         if(root==null) return 0;
//         return 1+Math.max(cntLevel(root.left),cntLevel(root.right));
//     }
//     private void printNthLevel(TreeNode root, int currlevel, int maxlevel,List<Integer> arr){
//         if(root==null) return;
//         if(currlevel==maxlevel){
//             arr.add(root.val);
//             return;
//         }
//         printNthLevel(root.left,currlevel+1,maxlevel,arr);
//         printNthLevel(root.right,currlevel+1,maxlevel,arr);
//     }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans=new ArrayList<>();
//         if(root==null) return ans; 
//         int n=cntLevel(root);
//         List<Integer> arr;
//         for(int i=1;i<=n;i++){
//             arr=new ArrayList<>();
//             printNthLevel(root,1,i,arr);
//             ans.add(arr);
//         }
//         return ans;
//     }
// }

// BY BFS METHOD WITH THE HELP OF DEQUE/QUEUE
class Solution {
    class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node=node;
            this.level=level;
        }
    }
    private int cntLevel(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(cntLevel(root.left),cntLevel(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Deque<Pair> dq=new ArrayDeque<>();
        dq.addLast(new Pair(root,0));
        //Algorithmic convention (most common in BFS problems) → root is at level 0
        int n=cntLevel(root);
        while(!dq.isEmpty()){
            Pair currpair=dq.removeFirst();
            TreeNode currroot=currpair.node;
            int currlevel=currpair.level;
            if (currlevel>=ans.size()) ans.add(new ArrayList<>());
            ans.get(currlevel).add(currroot.val);
            if(currroot.left!=null) dq.addLast(new Pair(currroot.left,currlevel+1));
            if(currroot.right!=null) dq.addLast(new Pair(currroot.right,currlevel+1));
        }
        return ans;
    }
}
