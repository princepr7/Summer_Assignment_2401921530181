/*
Question: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Approach: uses a fixed-size sliding window equal to the length of s1. It updates a frequency array by adding the incoming character and removing the outgoing character at each step, checking if the window's character counts perfectly match s1's counts.

Time complexity: O(n1+n2)
Space Complexity: O(1)

 

*/


class Solution{
    private boolean isAna(int[] arr, int[] brr){
        for(int i=0;i<26;i++){
            if(arr[i]!=brr[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String p, String s) {
        int n=p.length(), m=s.length();
        if(n>m) return false;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<n;i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(isAna(freq1,freq2)) return true;
        int l=0;
        for(int r=n;r<m;r++){
            freq2[s.charAt(r)-'a']++;
            freq2[s.charAt(l)-'a']--;
            l++;
            if(isAna(freq1,freq2)) return true;
        }
        return false;
    }
}
