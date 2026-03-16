class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] diff=new int[n][m];
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j]=Integer.MAX_VALUE;
                
            }
        }
        q.add(new int[]{0,0,0});
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int effort=arr[0];
            int row=arr[1];
            int col=arr[2];
            if(row==n-1 && col==m-1) return effort;
            for(int i=0;i<4;i++){
                int r=drow[i]+row;
                int c=dcol[i]+col;
                if(r>=0 && r<n && c>=0 && c<m){
                    int newEffort=Math.max(Math.abs((heights[r][c]-heights[row][col])),effort);
                    if(newEffort<diff[r][c]){
                        diff[r][c]=newEffort;
                        q.add(new int[]{newEffort,r,c});
                    }
                }
            }
        }
        return 0;
    }
}