class Solution {
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        } 
        return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int ans = 0;
        int count = 0;
        while(j < k){
            if(isVowel(s.charAt(j))){
                count++;
            }
            j++;
        }
        ans = Math.max(count,ans);
        for(int l = j ; l < n ; l++){
            if(isVowel(s.charAt(i))){
                count--;
            }
            if(isVowel(s.charAt(l))){
                count++;
            }
            i++;
            ans = Math.max(count,ans);
        }
        return ans;
    }
}