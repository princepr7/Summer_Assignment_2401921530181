Problem:
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.


Approach:
use two variable i and j pointing 0th index and last index of the given character array
start while loop with condition i<j and swap the character at i and j using temp variable


Complexity:
TC:O(n)
ASC:O(1)


Code:
class Solution {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;j--;
        }
    }
}
