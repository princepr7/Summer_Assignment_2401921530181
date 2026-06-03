/* Question : Given an integer array nums, move all 0's to the end of it,
while maintaining the relative order of the non-zero elements.

Approach : This code uses a **two-pointer approach** (l and r) to iterate through the array and find non-zero elements. Whenever a non-zero element is encountered, 
it is value at l pointer made ewual to r pointer and r pointer made zero when l!=r 

Time Complexity : O(n)
Space Complexity : O(1)

*/

class Solution {
    public void moveZeroes(int[] nums) {

        int n=nums.length,l=0;
        for(int r=0;r<n;r++){
            if(nums[r]!=0){
                nums[l]=nums[r];
                if(l!=r) nums[r]=0;
                l++;
            }
        }
    }
}
