class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        if(nums.length==0){
            return 0;
        }
        int max=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int c=1;
                int x=ele;
                while(set.contains(x+1)){
                    x=x+1;
                    c++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}