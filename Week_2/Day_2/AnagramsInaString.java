
// Problem: Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

// Approach: It uses a fixed-size sliding window matching the length of string p to track character frequencies in s. 
// As the window slides forward by one character, it includes the new character, discards the trailing one, and directly compares the frequency arrays to find matching anagram positions.

// Time complexity: O(n) [n is the length of s]
// Aux Space Complexity: O(1)


//code:
class Solution {
    private boolean isAna(int[] arr, int[] brr){
        for(int i=0;i<26;i++){
            if(arr[i]!=brr[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length(), m=s.length();
        if(n>m) return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<n;i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(isAna(freq1,freq2)) ans.add(0);
        int l=0;
        for(int r=n;r<m;r++){
            freq2[s.charAt(r)-'a']++;
            freq2[s.charAt(l)-'a']--;
            l++;
            if(isAna(freq1,freq2)) ans.add(l);
        }
        return ans;
    }
}
