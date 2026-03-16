class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        ArrayList<ArrayList<double[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double p = succProb[i];
            adj.get(u).add(new double[]{v,p});
            adj.get(v).add(new double[]{u,p});
        }
        PriorityQueue<double[]> q=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        double[] prob = new double[n];
        prob[start_node] = 1.0;
        q.add(new double[]{1.0,start_node});
        while(!q.isEmpty()){
            double[] arr=q.poll();
            double p=arr[0];
            int node=(int)arr[1];
            if(node==end_node) return p;
            for(double[] x:adj.get(node)){
                int newNode=(int)x[0];
                double maxp=x[1];
                if(maxp*p>prob[newNode]){
                    prob[newNode]=maxp*p;
                    q.add(new double[]{maxp*p,newNode});
                }
            }
        }
        return 0.0;
    }
}