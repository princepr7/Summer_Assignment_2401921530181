/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            TreeNode front=q.remove();
            if(front==null) sb.append('#').append(',');
            else{
                sb.append(front.val).append(",");
                q.add(front.left);
                q.add(front.right);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str=data.split(",");
        if(str[0].charAt(0)=='#') return null;
        TreeNode root=new TreeNode(Integer.parseInt(str[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(q.size()!=0){
            TreeNode front=q.remove();
            front.left=(str[i].charAt(0)=='#')?null:new TreeNode(Integer.parseInt(str[i]));
            if(front.left!=null) q.add(front.left);
            i++;
            front.right=(str[i].charAt(0)=='#')?null:new TreeNode(Integer.parseInt(str[i]));
            if(front.right!=null) q.add(front.right);
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
