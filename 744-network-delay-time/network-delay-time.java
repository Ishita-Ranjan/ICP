class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] it:times){
            int u=it[0];
            int v=it[1];
            int d=it[2];
            adj.get(u).add(new int[]{v,d});
        }
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] dist=new int[n+1];
        for(int i=1;i<=n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[k]=0;
        q.add(new int[]{0,k});
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int d=arr[0];
            int node=arr[1];
            for(int[] x:adj.get(node)){
                int newNode=x[0];
                int newDist=x[1];
                if(d+newDist<dist[newNode]){
                    dist[newNode]=d+newDist;
                    q.add(new int[]{d+newDist,newNode});
                }
            }
        }
        int min=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(dist[i]>min){
                min=dist[i];
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}