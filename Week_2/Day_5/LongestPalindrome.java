// Problem : Given a string s, return the longest palindromic substring in s.

// Approach : The code uses the Expand Around Center approach. It treats every character (for odd-length) and every gap between characters (for even-length) as a potential palindrome center, expanding outward as long as the matching characters on both sides are equal.

// Time Complexity : O(n*n)
// Space Complexity : O(n)


//code:
class Solution {
    static int lo=0, hi=0, max=0;
    private void checkPalin(int i,int j, String s){
        int n=s.length();
        while(i>=0 && j<n){
            if(s.charAt(i)!=s.charAt(j)) break;
            i--; j++;
        }
        j--; i++;
        int currmax=j-i+1;
        if(currmax>max){
            max=currmax;
            lo=i; hi=j;
        }
    }
    public String longestPalindrome(String s) {
        lo=0; hi=0; max=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            checkPalin(i,i,s);//odd length
            checkPalin(i,i+1,s);//even length
        }
        return s.substring(lo,hi+1);
    }
}
