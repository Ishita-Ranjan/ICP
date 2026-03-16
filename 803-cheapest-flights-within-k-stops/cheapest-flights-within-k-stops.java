class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] it:flights){
            int f=it[0];
            int t=it[1];
            int p=it[2];
            adj.get(f).add(new int[]{t,p});
        }
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] dist=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        q.add(new int[]{0,src,0});
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int step=arr[0];
            int node=arr[1];
            int d=arr[2];
            
            if(step>k) continue;
            for(int[] x:adj.get(node)){
                int newNode=x[0];
                int newDist=x[1];
                if(d+newDist<dist[newNode] && step<=k){
                    dist[newNode]=d+newDist;
                    q.add(new int[]{step+1,newNode,d+newDist});
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }
        return dist[dst];
    }
}