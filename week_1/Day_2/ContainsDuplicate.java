/* 
Question : Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Approach :using hashset

Time Complexity : O(n)
Space Complexity : O(n)

*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums) set.add(ele);
        return set.size()!=nums.length;
    }
}
