class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            max = Math.max(max,x);
        }
        if(n != max+1){
            return false;
        }
        int[]arr = new int[max+1];
        for(int i = 0 ; i < n ; i++){
            int idx = nums[i];
            arr[idx]++;
            if(idx!=max && arr[idx]>1){
                return false;
            }
            else if(idx == max && arr[idx]>2) return false;
        }
        return true;
    }
}