class Solution {
    public char findTheDifference(String s, String t) {
        int[]arr = new int[26];
        char ans = ' ';
        for(int i = 0 ; i < s.length() ; i++){
            int val = s.charAt(i) - 'a';
            arr[val]++;
        } 
        for(int j = 0 ; j < t.length() ; j++){
            int val =  t.charAt(j) - 'a';
            arr[val]--;
        } 
        for(int k = 0 ; k < arr.length ; k++){
            if(arr[k]<0){
                int x = k+ (int) 'a';
                ans = (char)x;
            }
        }
        return ans;
    }
}