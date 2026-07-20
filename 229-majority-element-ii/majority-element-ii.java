class Solution {
    public List<Integer> majorityElement(int[] arr) {
        // int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>arr.length/3){
                list.add(key);
            }
        }
        return list;
    }
}