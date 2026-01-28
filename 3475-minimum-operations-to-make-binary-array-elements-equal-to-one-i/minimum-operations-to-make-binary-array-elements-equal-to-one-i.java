class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        int n=nums.length;
        int i=0;
        while(i<n-2){
            if(nums[i]==0){
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1-nums[i+2];
                c++;
            }
            i++;
        }
        if(nums[n-1]==0 || nums[n-2]==0){
            return -1;
        }
        return c;
    }
}