// Problem Statement:
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

//Approach:
use two pointer variable i and j one at 0th index and other at last index. use while loop under condition i<j increase i when corresponding character is not targeted one and same with j when both are required ones compare them by converting them into lowercase



//Complexity:
TC:O(n)
ASC:O(1)


Code:
class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i), ch2=s.charAt(j);
            if(!(ch1>=48 && ch1<=57 || ch1>=65 && ch1<=90 || ch1>=97 && ch1<=122)){
                i++;
            }
            else if(!(ch2>=48 && ch2<=57 || ch2>=65 && ch2<=90 || ch2>=97 && ch2<=122)){
                j--;
            }
            else{
                if(ch1>=65 && ch1<=90) ch1=(char)(ch1+32); 
                if(ch2>=65 && ch2<=90) ch2=(char)(ch2+32); 
                if(ch1!=ch2) return false;
                i++;j--;
            }
        }
        return true;
    }
}
