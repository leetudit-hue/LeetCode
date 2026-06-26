class Solution {
    public static int weigth(String s , int[]arr){
        int n = s.length();
        int w = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            w+=arr[ch-'a'];
        }
        return w;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        int n = words.length;
        for(int i = 0 ; i < n ; i++){
            String s = words[i];
            int weight = weigth(s,weights)%26;
            char ch = (char) (122-weight);
            sb.append((ch));
        }
        return sb.toString();
    }
}