class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] visited=new int[n];
        for(int i=0;i<n;i++){
            visited[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                visited[i]=0;
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int it:graph[node]){
                        if(visited[it]==-1){
                            visited[it]=1-visited[node];
                            q.add(it);
                        }
                        if(visited[it]==visited[node]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}