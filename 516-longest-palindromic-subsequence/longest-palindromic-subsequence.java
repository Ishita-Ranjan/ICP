class Solution {
    int[][] dp=new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        String t=new StringBuilder(s).reverse().toString();
        int n=s.length();
        int m=t.length();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}