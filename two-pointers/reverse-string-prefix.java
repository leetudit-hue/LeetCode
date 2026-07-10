class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int j = k-1;
        while(j >= 0){
            sb.append(s.charAt(j));
            j--;
        }
        j = k;
        while(j < s.length()){
            sb.append(s.charAt(j));
            j++;
        }
        return sb.toString();
    }
}