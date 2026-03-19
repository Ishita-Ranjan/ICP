class Solution {
    int[] dp=new int[46];
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        return steps(n,0);
    }
    public int steps(int n,int step){
        if(step>n) return 0;
        if(step==n) return 1;
        if(dp[step]!=-1) return dp[step];
        int a=steps(n,step+1);
        int b=steps(n,step+2);
        return dp[step]=a+b;
    }
} 