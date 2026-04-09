class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            String str=Integer.toBinaryString(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}