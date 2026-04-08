class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                list.add(key);
            }
        }
        return list;
        }
    
}