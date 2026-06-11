Problem: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Approach:
Use backtracking to generate all valid parentheses combinations. At each step, try adding '(' or ')' to the current string. If the number of closing parentheses exceeds the number of opening parentheses (r > l), prune that path since it can never form a valid sequence. When the string reaches length 2 * n, add it to the answer only if the number of opening and closing parentheses is equal.


  
Time complexity: O(4^n*n)
Space complexity: O(4^n)

Code:
class Solution {
    private void DFS(int l, int r, int n,StringBuilder sb,List<String> ans){
        if(r>l) return;
        if(sb.length()==2*n){
            if(l!=r) return;
            String s=sb.toString();
            ans.add(s);
            return;
        }
        sb.append('(');
        DFS(l+1,r,n,sb,ans);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        DFS(l,r+1,n,sb,ans);
        sb.deleteCharAt(sb.length()-1);

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        DFS(0,0,n,new StringBuilder(),ans);
        return ans;
    }
}
