class Solution {
    public int partitionString(String s) {
        int n = s.length();
        int[]arr = new int[26];
        Arrays.fill(arr,-1);
        int st = 0;
        int c = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(arr[ch-'a'] >= st){
                c++;
                st = i;
            }
            arr[ch-'a'] = i;
        }
        return c+1;
    }
}