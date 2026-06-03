// Problem Statement: You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

//Approach:
//using two pointer approach keep l at 0 and r at  n-1 then tract the current capacity and move the pointer whose height is smaler to get better answer

//Complexity:
//TC:O(n)
//SC:O(1)

//Code:
class Solution {
    public int maxArea(int[] height) {
        int n=height.length, l=0, r=n-1, maxi=0;
        while(l<r){
            if(height[l]<height[r]){
                int currmaxi=height[l]*(r-l);
                maxi=Math.max(currmaxi,maxi);
                l++;
            }
            else{
                int currmaxi=height[r]*(r-l);
                maxi=Math.max(currmaxi,maxi);
                r--;
            }
        }
        return maxi;
    }
}
