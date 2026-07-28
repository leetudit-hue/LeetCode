class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[]temp = new char[n/2];
        for(int i = 0 ; i < n/2 ; i++){
            temp[i] = s.charAt(i);
        }
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n/2 ; i++){
            sb.append(temp[i]);
        }
        if(n % 2 != 0) sb.append(s.charAt(n/2));
        int j = (n/2 - 1);
        while(j >= 0){
            sb.append(temp[j]);
            j--;
        }
        return sb.toString();
    }
}