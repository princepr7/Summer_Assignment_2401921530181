class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        int least=t-3000;
        q.add(t);
        while(q.peek()<least) q.remove();
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
