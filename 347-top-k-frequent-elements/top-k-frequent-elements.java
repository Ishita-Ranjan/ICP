class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);}
            List<Integer> list = new ArrayList<>(mpp.keySet());

        Collections.sort(list,(a,b)-> mpp.get(b)-mpp.get(a));

        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}