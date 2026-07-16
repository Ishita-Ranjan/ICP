class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int a=0, b=0, c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                a++;
            }
            else if(nums[i]==1){
                b++;
            }
            else{
                c++;
            }
        }
        int idx=0;
        while(idx<n){
            if(a>0){
                nums[idx]=0;
                a--;
            }
            else if(b>0){
                nums[idx]=1;
                b--;
            }
            else{
                nums[idx]=2;
                c--;
            }
            idx++;
        }
    }
}