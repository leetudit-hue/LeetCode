class Solution {
    public String reverseWords(String s) {
        String[]arr = s.split(" ");
        int n = arr.length;
        String ans = "";
        for(int i = n-1 ; i >=0 ; i--){
            if(arr[i] == ""){
                continue;
            }
            else{
                ans+=" "+arr[i];
            }
        }
        return ans.trim();
    }
}