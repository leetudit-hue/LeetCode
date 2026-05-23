class Solution {
    public int[]leftMax(int[]height,int[]left,int n){
        for(int i = 1 ; i < n ; i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        return left;
    }
    public int[]rightMax(int[]height,int[]right,int n){
        for(int j = n-2 ; j >= 0 ; j--){
            right[j]=Math.max(height[j],right[j+1]);
        }
        return right;
    }
    public int trap(int[] height) {
        int n = height.length;
        int[]left = new int[n];
        int[]right = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        left = leftMax(height,left,n);
        right = rightMax(height,right,n);
        int water = 0;
        for(int i = 0 ; i < n ; i++){
            water+=Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
}