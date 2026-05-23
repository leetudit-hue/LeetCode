class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while(l <= r){
            while(l < r && nums[l] == nums[l+1]){
                l++;
            }
            while(r > l && nums[r] == nums[r-1]){
                r--;
            }
            int mid = l+(r-l)/2;
            if(nums[mid]<nums[ans]){
                ans = mid;
            }
            else if(nums[mid]>nums[r]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return nums[ans];
    }
}