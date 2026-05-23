class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int l = 0;
        int r = height.length -1;
        while(l < r){
            int w = r-l;
            int h = Math.min(height[l],height[r]);
            int a = w*h;
            ans = Math.max(a,ans);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}