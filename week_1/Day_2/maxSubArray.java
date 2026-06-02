/*Question : Given an integer array nums, find the subarray with the largest sum, and return its sum.

Approach : Using Kadane's algorithm that keep a running total as you walk through the numbers,
resetting it to zero the moment it drops below zero (since debt hurts future totals). 
Along the way, you simply remember the highest peak that running total ever reached.

Time Complexity : O(n)
Space Complexity : O(1)
  
  */

class Solution {
    public int maxSubArray(int[] nums) {

        int maxi=nums[0], currmaxi=0, n=nums.length;
        for(int ele:nums){
            currmaxi=Math.max(currmaxi+ele,ele);
            maxi=Math.max(maxi,currmaxi);
        }
        return maxi;


    }
}
