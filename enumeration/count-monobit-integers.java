class Solution {
    public static boolean Monobit(int n){
        String s = Integer.toBinaryString(n);
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public int countMonobit(int n) {
        int c = 0;
        for(int i = 0 ; i <= n ; i++){
            if(Monobit(i)){
                c++;
            }
        }
        return c;
    }
}