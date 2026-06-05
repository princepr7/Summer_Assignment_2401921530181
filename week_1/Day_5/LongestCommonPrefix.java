Problem statement:
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".


Approach:
checking all strings from 0 to m-1 indexes of strs array for their character at idx=0 then 1 then 2,3,4...up to when one  character conflicts the equality or idx becomes greater than or equal to their length
where conflicts occur return substring from 0 to idx-1 of string at 0th index





code:
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int m=strs.length,idx=0;
        while(true){
            if(idx>=strs[0].length()) return strs[0].substring(0,idx);
            for(int i=1;i<m;i++){
                if(idx>=strs[i].length() || strs[i].charAt(idx)!=strs[i-1].charAt(idx)) return strs[0].substring(0,idx);
            }
            idx++;
        }

    }
}
