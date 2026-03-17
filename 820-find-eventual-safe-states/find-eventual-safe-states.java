class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int u=0;u<n;u++){
            for(int v:graph[u]){
                adj.get(v).add(u);
                indegree[u]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            topo.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(topo);
        return topo;
    }
}