//Problem statement: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

//Approach:keep one pointer r at non-negative number and l pointer at last non negative number. then compare both absolute values at l and r pointer and store the square os minimum in ans array

//Complexity:
// TC:O(n);
// SC:O(1);


//Code:
class Solution {
    public int[] sortedSquares(int[] nums) {
        int r=0, n=nums.length;
        while(r<n && nums[r]<0) r++;
        int[] ans=new int[n];
        int l=r-1, idx=0;
        while(l>=0 && r<n){
            if(-nums[l]<nums[r]) {ans[idx++]=nums[l]*nums[l];l--;}
            else {ans[idx++]=nums[r]*nums[r];r++;}
        }
        while(l>=0){
            ans[idx++]=nums[l]*nums[l];l--;
        }
        while(r<n){
            ans[idx++]=nums[r]*nums[r];r++;
        }
        return ans;
    }
}
