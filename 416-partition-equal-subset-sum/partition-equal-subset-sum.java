class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int half=sum/2;
        Boolean[][] dp=new Boolean[n+1][half+1];
        return subset(nums,half,n,dp);

    }
    public boolean subset(int[] nums, int half, int n,Boolean[][] dp){
        if(n==0) return false;
        if(half==0) return true;
        if(dp[n][half]!=null) return dp[n][half];
        if(nums[n-1]>half){
            return dp[n][half]=subset(nums,half,n-1,dp);
        }
        else{
            return dp[n][half]=subset(nums,half-nums[n-1],n-1,dp) || subset(nums,half,n-1,dp);
        }
    }
}