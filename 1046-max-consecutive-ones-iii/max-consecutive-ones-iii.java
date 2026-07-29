class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero>k){
                    break;
                }
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}