Problem Statement
Given an m x n matrix, return all elements of the matrix in spiral order.

Approach:
we assign the four variable pointing to starting row, starting column and end row and ending column and will traverse in spiral order using these variable firse we traverse all elements of starting row and then all elements of end column and then all elemnts of end row and then all elements of starting column by checking the boundary cinditions i.e. sr<=er && sc<=ec always and repeats this traversal until boundary condition satisfies

Complexity:
TC:O(n^2)
ASC:O(n^2)


Code:
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length, n=matrix[0].length, sr=0, sc=0, er=m-1,ec=n-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ans.add(matrix[sr][i]);
            }
            sr++;
            for(int i=sr;i<=er;i++){
                ans.add(matrix[i][ec]);
            }
            ec--;
            for(int i=ec;i>=sc && sr<=er;i--){
                ans.add(matrix[er][i]);
            }
            er--;
            for(int i=er;i>=sr && sc<=ec ;i--){
                ans.add(matrix[i][sc]);
            }
            sc++;
        }
        return ans;

    }
}
