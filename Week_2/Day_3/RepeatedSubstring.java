// Problem : Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

// //Approach: Try every possible substring length len that divides the string length. Treat the first len characters as the repeating pattern and compare the remaining characters with this pattern using idx % len. If all characters match for any valid len, return true; otherwise return false.

// Time Complexity: O(n²)
// Aux Space Complexity: O(1)
  
// Code:
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) continue;
            int idx=0;
            int i=len;
            for (i = len; i<n; i++) {
                idx=idx%len;
                if(s.charAt(idx)!=s.charAt(i)) break;
                idx++;
            }
            if(i==n) return true;
        }

        return false;
    }
}
