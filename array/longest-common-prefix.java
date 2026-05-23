class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        String ans = "";
        int i = 0;
        // if(first.length() == 0 || last.length() == 0){
        //     return "";
        // }
        while(i < first.length() && i < last.length()){
            if(first.charAt(i)!=last.charAt(i)){
                return ans;
            }
            ans+=first.charAt(i);
            i++;
        }
        return ans;
    }
}