class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0, max=0;
        int zero=0;
            for(int r=0;r<n;r++){
                if(nums[r]==0){
                    zero++;
                }
                if(zero>k){
                    if(nums[l]==0){
                        zero--;
                    }
                    l++;
                }
                max=Math.max(max,r-l+1);
            }
        
        return max;
    }
}