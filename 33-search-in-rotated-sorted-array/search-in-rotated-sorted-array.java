class Solution {
    int findPvt(int[]nums){
        int l = 0;
        int r = nums.length - 1;
        int mid = -1;
        while(l < r){
            mid = l + (r - l) / 2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
    int bs(int[]nums , int target , int l , int r){
        int mid = -1;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot = findPvt(nums);
        int res1 = bs(nums , target , 0 , pivot - 1);
        int res2 = bs(nums , target , pivot , nums.length - 1);
        if(res1 != -1) return res1;
        if(res2 != -1) return res2;
        return -1;
    }
}