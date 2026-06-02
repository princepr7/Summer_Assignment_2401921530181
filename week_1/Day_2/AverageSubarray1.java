/*
Question : You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value

Approach : The code creates a frame of size k and slides it across the array by adding the next incoming number and dropping the oldest outgoing number.
It tracks the highest sum trapped inside this moving frame and divides it by k at the very end.

Time Complexity : O(n)
Space Complexity : O(1)
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0, n=nums.length; double ans=-Double.MAX_VALUE, currsum=0;
        for(int r=0;r<n;r++){
            currsum+=nums[r];
            if((r-l+1)>k){
                currsum-=nums[l];
                l++;
            }
            if((r-l+1)==k) ans=Math.max(ans,currsum);
        }
        return ans/k;
    }
}
