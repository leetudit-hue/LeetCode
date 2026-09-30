class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int d = 0;
        int[]ans = new int[n];
        int idx = 0;
        for(char ch : seq.toCharArray()){
            if(ch == '('){
                d++;
                if(d % 2 == 0){
                    ans[idx++] = 0;
                }
                else{
                    ans[idx++] = 1;
                }
            }
            else{
                if(d % 2 == 0){
                    ans[idx++] = 0;
                }
                else{
                    ans[idx++] = 1;
                }
                d--;
            }
        }
        return ans;
    }
}