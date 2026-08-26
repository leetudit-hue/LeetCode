class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String res = "";
        for(int i = 0 ; i <= n-k ; i++){
            for(int j = i+k ; j <= n ; j++){
                String temp = s.substring(i,j);
                int one = 0;
                for(int l = 0 ; l < temp.length() ; l++){
                    if(temp.charAt(l) == '1'){
                        one++;
                    }
                }
                if(one == k){
                    if(temp.length() < res.length() || res.length() == 0 || (temp.length() == res.length() && temp.compareTo(res) < 0)){
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
}