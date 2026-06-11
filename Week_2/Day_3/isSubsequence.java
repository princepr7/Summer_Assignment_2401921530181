// Problem : Given two strings s and t, return true if s is a subsequence of t, or false otherwise...

// Approach : Used a simple iterative approach to compare characters and finally return true if all the characters are matched in the increasing order in string t.

// Time Complexity : O(n2)
// Spce Complexity : O(1)

// Code:

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(), m=t.length();
        if(n>m) return false;
        if(n==0) return true;
        int idx=0;
        for(int i=0;i<m;i++){
            if(t.charAt(i)==s.charAt(idx)){
                idx++;
            }
            if(idx==n) return true;
        }
        return false;
    }
}


