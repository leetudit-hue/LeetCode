class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(leftMax[i - 1],height[i]);
        }
        rightMax[n - 1] = height[n - 1];
        for(int j = n - 2 ; j >= 0 ; j--){
            rightMax[j] = Math.max(rightMax[j + 1] , height[j]);
        }
        for(int k = 0 ; k < n ; k++){
            ans += (Math.min(rightMax[k] , leftMax[k]) - height[k]);
        }
        return ans;
    }
}