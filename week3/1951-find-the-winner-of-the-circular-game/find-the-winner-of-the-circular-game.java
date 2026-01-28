class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()!=1){
            int i=1;
            while(i<k){
                q.add(q.peek());
                q.poll();
                i++;
            }
            q.poll();
        }
        return q.peek();
    }
}