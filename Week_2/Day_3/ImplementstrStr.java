// Problem : Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Approach : uses a brute-force sliding window approach that checks every possible starting position in the haystack.
// At each position i, it uses a nested loop to compare characters one-by-one to see if they exactly match the needle.

//   Time Complexity : O((n1-n2)*n2)
//   Spce Complexity : O(1)


// Code:
class Solution {
    private boolean Check(String s1,int i, int j, String s2){
        int idx=0;
        for(int k=i;k<=j;k++){
            if(s1.charAt(k)!=s2.charAt(idx)) return false;
            idx++;
        }
        return true;
    }
    public int strStr(String s2, String s1) {
        int n=s1.length(), m=s2.length();
        if(n>m) return -1;
        int l=0;
        for(int r=n-1;r<m;r++){
            if(Check(s2,l,r,s1)) return l;
            l++;
        }
        return -1;
    }
}
