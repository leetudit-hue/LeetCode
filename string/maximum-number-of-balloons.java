class Solution {
    public static int helper(int[]arr){
        int count = 0;
        boolean flag = true;
        while(flag){
            if((arr['l'-'a'] >= 2) && (arr['o' -'a'] >= 2)&& (arr['a'-'a'] >= 1) && (arr['b'-'a'] >= 1 )&& (arr['n'-'a'] >= 1)){
                count++;
                arr['l'-'a']--;
                arr['l'-'a']--;
                arr['o' -'a']--;
                arr['o' -'a']--;
                arr['a'-'a']--;
                arr['b'-'a']--;
                arr['n'-'a']--;
            }
            else{
                flag = false;
            }
        }
        return count;
    }
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        int n = text.length();
        int[]arr = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = text.charAt(i);
            arr[ch-'a']++;
        }
        count = helper(arr);
        return count;
    }
}