class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ele=nums[0],c=1;
        for(int i=1;i<n;i++){
            if(nums[i]==ele){
                c++;
            }
            else{
                if(c>0){
                    c--;
                }
                if(c==0){
                    ele=nums[i];
                    c=1;
                }
            }
        }
        return ele;
    }
} 