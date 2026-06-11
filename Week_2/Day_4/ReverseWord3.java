// Problem:
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Approach:
// Convert the input string into a StringBuilder so characters can be modified in-place. Traverse the string and whenever a space is encountered, reverse the word between the previous word boundary (l) and the character before the space. After the traversal, reverse the last word and return the resulting string.

// Time Complexity
// O(n)
// Space Complexity
// O(n)

// Code:
class Solution {
    private void Reverse(StringBuilder sb, int i, int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        int l=0;
        for(int r=0;r<n;r++){
            if(s.charAt(r)==' '){
                Reverse(sb,l,r-1);
                while(r<n && s.charAt(r)==' ') r++;
                l=r;
            }
            
        }
        Reverse(sb,l,n-1);
        return sb.toString();


    }
}
