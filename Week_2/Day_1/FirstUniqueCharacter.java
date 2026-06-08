/*
Question : Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Approach : uses a frequency array to count occurrences of each character in a first pass, then scans the string a second time to find the first character with a frequency of exactly 1.

Time Complexity : O(n)
Space Complexity : O(1)
*/


class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
        }
}
