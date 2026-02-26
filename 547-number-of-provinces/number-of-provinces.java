class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        int[] visit=new int[v+1];
        int c=0;
        for(int i=0;i<v;i++){
            if(visit[i] == 0){
                c++;
                visit[i]=1;
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for (int j = 0; j < v; j++) {
                        if (isConnected[node][j] == 1 && visit[j]==0) {
                            visit[j] = 1;
                            q.add(j);
                        }
                    }
            
                }
            }
        }
        return c;
    }
}