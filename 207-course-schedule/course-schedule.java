class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] it:prerequisites){
            int u=it[0];
            int v=it[1];
            adj.get(v).add(u);
        }
        int[] indegree=new int[numCourses];
        for(int[] it : prerequisites){
            indegree[it[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int node=q.poll();
            c++;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(c!=numCourses){
            return false;
        }
        return true;
    }
}