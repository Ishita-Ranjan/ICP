class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int req=target-curr;
            if(mpp.containsKey(req)){
                ans[0]=mpp.get(req)+1;
                ans[1]=i+1;
            }
            mpp.put(curr,i);
        }
        return ans;
    }
}