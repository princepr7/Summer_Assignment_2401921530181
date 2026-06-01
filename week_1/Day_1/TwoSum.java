/* 
Problem : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
(Two Sum Problem)

Approach: Used a hash map to store elements and their indices for efficient lookup. Hence reducing the overall time complexity of the code
and improved efficiency

Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=target-nums[i];
            if(!map.isEmpty() && map.containsKey(num)){
                return new int[] {i,map.get(num)};
            }
            map.put(nums[i],i);
        }
        return new int[] {0,1};
    }
}
