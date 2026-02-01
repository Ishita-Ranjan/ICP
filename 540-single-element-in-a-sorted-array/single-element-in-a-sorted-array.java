class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(mid%2!=0){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else{
                r=mid;
            }
        }
        return nums[l];

        // int ans=0;
        // for(int n:nums){
        //     ans^=n;
        // }
        // return ans;
    }
}