class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0 ; int j = n-1;
        while(colors[i]==colors[j]){
            i++;
        }
        int ans = j-i;
        i = n-1;
        j = 0;
        while(colors[i]==colors[j]){
            i--;
        }
        ans = Math.max(ans,Math.abs(i-j));
        return ans;
    }
}