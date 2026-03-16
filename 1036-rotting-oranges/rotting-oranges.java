class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    visited[i][j]=2;
                    q.add(new int[]{i,j,0});
                }
            }
        }
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int max=0;
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int row=arr[0];
            int col=arr[1];
            int l=arr[2];
            max=Math.max(l,max);
            for(int i=0;i<4;i++){
                int r=drow[i]+row;
                int c=dcol[i]+col;
                if(r>=0 && c>=0 && r<n && c<m && grid[r][c]==1 && visited[r][c]==0){
                    visited[r][c]=2;
                    q.add(new int[]{r,c,l+1});
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    return -1;
                }
            }
        }
        return max;
    }
}