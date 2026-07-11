class Solution {
    public static int findPvt(int[]nums){
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }

    public static int bs(int[]nums,int l,int r,int tar){
        int mid = -1;
        int ans = -1;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(nums[mid] > tar){
                r = mid - 1;
            }
            else if(nums[mid] < tar){
                l = mid + 1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pvt = findPvt(nums);
        int left = bs(nums,0,pvt-1,target);
        if(left != -1) return left;
        return bs(nums,pvt,n-1,target);
    }
}