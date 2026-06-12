
Problem : Given an array of characters chars, compress it using the following algorithm:.......

Approach : uses a two-pointer technique where one pointer (i) finds the bounds of each repeating character group, and another (ansLength) writes the character followed by its count (if greater than 1) directly back into the input array.
By updating i to the next unique character (j) at the end of each loop, it compresses the array in place without using extra space.

Time complexity : O(n)
Aux Space complexity : O(1)



code:
// class Solution {
//     public int compress(char[] chars) {
//         int n=chars.length;
//         int idx=0;
//         int cnt=1;
//         for(int j=1;j<n;j++){
//             if(chars[j]!=chars[j-1]){
//                 chars[idx++]=chars[j-1];
//                 if(cnt>9){
//                     String st=""+cnt;
//                     for(int k=0;k<st.length();k++){
//                         chars[idx++]=st.charAt(k);
//                     }
//                 } 
//                 else if(cnt>1) chars[idx++]=(char)(cnt+48);
//                 cnt=1;
//             }
//             else cnt++;
//         }
//         chars[idx++]=chars[n-1];
//         if(cnt>9){
//             String st=""+cnt;
//             for(int k=0;k<st.length();k++){
//                 chars[idx++]=st.charAt(k);
//             }
//         } 
//         else if(cnt>1) chars[idx++]=(char)(cnt+48);
//         return idx;
        
//     }
// }


//SAME AS ABOVE BUT IN MORE CLEANER AND INCLUDE N-1TH CHARACTER COMPRESSION IN LOOP 
class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        int cnt=1;
        for(int j=1;j<=n;j++){
            if(j<n && chars[j]==chars[j-1]) cnt++;
            else {
                chars[idx++]=chars[j-1];
                if(cnt>1){
                    String st=""+cnt;
                    for(int k=0;k<st.length();k++){
                        chars[idx++]=st.charAt(k);
                    }
                }
                cnt=1;
            }
        }
        return idx;
        //WE CAN ALSO DO IT LIKE FIRST STORE ALL ANS CHARACTER WITH THEIR LENGTH IN A STRINBUILDER AND THEN RUN A LOOP AND CHSNGE THEM IN CHARACTER ARRAY
    }
}
