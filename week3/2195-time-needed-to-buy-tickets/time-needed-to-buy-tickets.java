class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int n=tickets.length;
        // Queue<Integer> q=new LinkedList<>();
        // for(int i=0;i<n;i++){
        //     q.offer(i);
            
        // }

        // int time=0;
        // while(!q.isEmpty()){
        //     int front=q.peek();
        //     tickets[front]--;
        //     time++;
        //     q.poll();
        //     if(front==k && tickets[front]==0){
        //         return time;
        //     }
        //     else if(tickets[front]!=0){
        //         q.add(front);
        //     }
        // }
        // return 0;


        int time=0;
        int n=tickets.length;
        for(int i=0;i<n;i++){
            if(i<=k){
                time+=Math.min(tickets[k],tickets[i]);
            }
            else{
                time+=Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return time;
    }
}