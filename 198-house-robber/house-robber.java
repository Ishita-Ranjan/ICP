class Solution {
    public int rob(int[] nums) {
        int n=nums.length-1;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return robbery(nums,0,dp,n);
    }
    public int robbery(int[] nums,int i,int[] dp,int n){
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int taken=nums[i]+robbery(nums,i+2,dp,n);
        int notTaken=robbery(nums,i+1,dp,n);
        return dp[i]=Math.max(taken,notTaken);
    }
} 