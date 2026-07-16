class Solution {
    public int findDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            int c=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    c++;
                }
            }
            if(c>mid){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}