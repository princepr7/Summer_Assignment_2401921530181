// Problem: Given an encoded string, return its decoded string.
// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// Approach: using a recursive DFS approach, where meeting a [ triggers a new recursive call to decode the inner nested substring. When a matching ] is hit, it returns the decoded segment back to the parent call, which multiplies it by the parsed coefficient and appends it to the result.

// Time Complexity: O(n) where n is the final decoded length
// Aux Space Complexity: O(n) for recursion stack and result string


// Code:
class Solution {
    public String decodeString(String s) {
        int[] idx = {0};
        return decode(s, idx);
    }

    private String decode(String s, int[] idx) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (idx[0] < s.length()) {
            char c = s.charAt(idx[0]);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                idx[0]++;
            } 
            else if (c == '[') {
                idx[0]++;
                String inner = decode(s, idx);

                for (int k = 0; k < num; k++) {
                    result.append(inner);
                }

                num = 0;
            } 
            else if (c == ']') {
                idx[0]++;
                return result.toString();
            } 
            else {
                result.append(c);
                idx[0]++;
            }
        }

        return result.toString();
    }
}
