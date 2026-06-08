/*
Question : Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote

Approach : uses a frequency array to count the required characters from ransomNote (incrementing counts) and subtracts available characters from magazine (decrementing counts), finally checking if any required character count remains above zero.

Time Complexity : O(n1+n2)
Spce Complexity : O(1)
*/


class Solution {
    public boolean canConstruct(String s1, String s2) {
        int n=s1.length(), m=s2.length();
        if(n>m) return false;
        int[] freq=new int[26];
        for(int i=0;i<m;i++){
            freq[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']--;
            if(freq[s1.charAt(i)-'a']<0) return false;
        }
        return true;
    }
}
