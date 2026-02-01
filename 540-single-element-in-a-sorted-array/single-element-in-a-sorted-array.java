class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int n=nums.length;
        // int l=0,r=n-1;
        // if(n==1){
        //     return nums[0];
        // }
        // while(l<r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
        //         return nums[mid];
        //     }
        //     if(((mid%2==0) && nums[mid]==nums[mid+1]) || (mid%2!=0) && nums[mid]==nums[mid-1]){
        //         l=mid+1;
        //     }
        //     else{
        //         r=mid-1;
        //     }
        // }
        // return nums[l];

        int ans=0;
        for(int n:nums){
            ans^=n;
        }
        return ans;
    }
}