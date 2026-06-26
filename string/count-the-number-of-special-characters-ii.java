class Solution {
    static boolean check(char ch){
        if(ch>=97 && ch < 123){
            return true;
        }
        return false;
    }
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int ans = 0;
        int[]small = new int[26];
        int[]large = new int[26];
        Arrays.fill(small,-1);
        Arrays.fill(large,-1);
        for(int i = 0 ; i < n ; i++){
            char ch = word.charAt(i);
            if(check(ch)){
                small[word.charAt(i)-'a'] = i;
            }
            else{
                if(large[word.charAt(i)-'A'] == -1){
                    large[word.charAt(i)-'A'] = i;
                }
            }
        }
        for(int i = 0 ; i < 26 ; i++){
            if(small[i]!=-1 && large[i]!=-1 && small[i]<large[i]){
                ans++;
            }
        }
        return ans;
    }
}