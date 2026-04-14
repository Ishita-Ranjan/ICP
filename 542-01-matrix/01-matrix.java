class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int[][] dist=new int[n][m];
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    visited[i][j]=true;
                }
            }
        }
        int[] drow={-1, 0, 1, 0};
        int[] dcol={0, 1, 0, -1};
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int row=arr[0];
            int col=arr[1];
            int steps=arr[2];
            dist[row][col]=steps;
            for(int i=0;i<4;i++) {
                int r=row+drow[i];
                int c=col+dcol[i];
                if(r>=0 && c>=0 && r<n && c<m && !visited[r][c]) {
                    visited[r][c]=true;
                    q.add(new int[]{r,c,steps+1});
                }
            }
        }
        return dist;
    }
}