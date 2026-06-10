
// Problem: Given a string s, find the length of the longest substring without duplicate characters.

// Approach: A sliding window technique where the right pointer expands the window and pos array tracks each character's latest index; when a duplicate is found, the left pointer instantly jumps past its previous position to keep all characters unique.

// Time complexity: O(n)
// Space Complexity:O(n)

 //code:
class Solution {
    public int lengthOfLongestSubstring(String s) {

        //with hashmap(slow due to object overhead)
      
        // HashMap<Character,Integer> map= new HashMap<>();
        // int strt=0, end=0, n=s.length(), max=0;
        // for(end=0;end<n;end++){
        //     char ch=s.charAt(end);
        //     if(map.containsKey(ch)){
        //         strt=Math.max(strt,map.get(ch)+1);
        //     }
        //     map.put(ch,end);
        //     max=Math.max(max,end-strt+1);
        // }
        // return max;

        // with pos array(fast)
        int[] pos=new int[128];
        int l=1, maxi=0, n=s.length();
        for(int r=1;r<=n;r++){
            char ch=s.charAt(r-1);
            if(pos[ch]!=0){
                l=Math.max(pos[ch]+1,l);
            }
            pos[ch]=r;
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}

  
