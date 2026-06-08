/*
Question : Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Approach : Created a fixed size arrray of size 26 that will increase the frequency of each character in s by 1 and decrease the frequency of each 
character in t by 1 . Finally loop through the vector and return false if a mismatch is found otherwise true.

Time Complexity : O(n)
Space Complexity : O(1)



*/


class Solution {
    public boolean isAnagram(String s, String t) {


        int n=s.length(),m=t.length();
        if(n!=m) return false;
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++){
            freq[t.charAt(i)-'a']--;
            if(freq[t.charAt(i)-'a']<0) return false;
        }
        return true;
        
    }
}
