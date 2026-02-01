class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
               ans[0]=mid;
               r=mid-1; 
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        l=0;
        r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}