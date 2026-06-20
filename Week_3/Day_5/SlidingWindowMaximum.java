class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //BRUTE FORCE O(n*k)

        // int n=nums.length;
        // int[] ans=new int[n-k+1];
        // int i=0,j=k-1;
        // for(int p=0;p<n-k+1;p++){
        //     int max=nums[i];
        //     for(int q=i+1;q<=j;q++){
        //         if(nums[q]>max) max=nums[q];
        //     }
        //     i++;j++;
        //     ans[p]=max;
        // }
        // return ans;

        //OPTIMAL O(n)
        
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] ans=new int[n-k+1];
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.removeFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.removeLast();
            dq.addLast(i);
            if(i>=k-1) ans[i-(k-1)]=nums[dq.peekFirst()];
        }
        return ans;
    }
}
