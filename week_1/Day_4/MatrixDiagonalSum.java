//Problem Statement:
// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

  //Approach:
//take two pointer variable i and j one representing row and one representing column first keep i at 0 and keep j at 0 then traverse acorsingly by increasingEeach by 1 in each iteration to cover all the preimary diagonal element and then set i to 0 and j to n-1 and increase i with 1 and decrease j with 1 in each iteration of while loop to cover secondary diaglonal element. Include if condition to avoid element when i==j as it was already counred in proimary diagonal element


  //Complexity:
// TC:O(n)
// SC:O(1)


//code:
class Solution {
    public int diagonalSum(int[][] mat) {
        //brute
      
        // int n=mat[0].length, ans=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j) ans+=mat[i][j];
        //         else if(i+j==(n-1)) ans+=mat[i][j];
        //     }
        // }
        // return ans;

        //optimal
      
        int i=0, j=0, n=mat.length, ans=0;
        while(i<n){
            ans+=mat[i][j];
            i++;j++;
        }
        i=0; j=n-1;
        while(i<n){
            if(i!=j) ans+=mat[i][j];
            i++;j--;
        }
        return ans;

    }
}
