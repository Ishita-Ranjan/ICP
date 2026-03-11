class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int req=target-curr;
            if(mpp.containsKey(req)){
                ans[0]=mpp.get(req);
                ans[1]=i;
                break;
            }
            mpp.put(curr,i);
        }
        return ans;
    }
}