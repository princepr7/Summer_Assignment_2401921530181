// Problem: Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// Approach: This approach sorts each string alphabetically to create a standardized "key" that identifies its anagram family. It then uses a hash map to group all original strings that share the same sorted key, returning the grouped values at the end.

// Time complexity: O(N*Llog(L)) [N: Number of strings , L : Maximum Length of a string]
// Aux Space complexity: O(N*L)


// Code:
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(map.containsKey(key)) map.get(key).add(s);
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }

        List<List<String>> ans=new ArrayList<>();
        for(List<String> list:map.values()) ans.add(list);
        return ans;
    }
}
