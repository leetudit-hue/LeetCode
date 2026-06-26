class Solution {
    static boolean isUpper(char ch){
        if(ch >= 65 && ch <= 90) return true;
        return false;
    }
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int count = 0;
        int[]arr = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = word.charAt(i);
            if(isUpper(ch) && arr[ch-'A'] == 0){
                arr[ch-'A'] = 1;
                boolean found = false;
                int k = 0;
                int j = n-1;
                char c = (char) (ch + 32);
                while(k < i){
                    if(word.charAt(k) == c){
                        found = true;
                        break;
                    }
                    k++;
                }
                while(j > i){
                    if(word.charAt(j) == c){
                        found = true;
                        break;
                    }
                    j--;
                }
                if(found) count++;
            }
        }
        return count;
    }
}