class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=1;
        int ans=0;
        if(nums.length==0){
            return 0;
        }
        int i=0;
        while(i<n-1){
            if(nums[i+1]-nums[i]==1){
                c++;
            }
            else if(nums[i+1]-nums[i]>1){
                ans=Math.max(ans,c);
                c=1;
            }
            
            i++;
        }
        ans=Math.max(ans,c);
        return ans;
    }
}