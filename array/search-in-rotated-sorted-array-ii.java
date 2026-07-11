class Solution {
    public static int findPvt(int[]nums){
        int l = 0;
        int r = nums.length - 1;
        while(l < r && nums[l] == nums[l+1]){
            l++;
        }
        while(r > l && nums[r] == nums[r-1]){
            r--;
        }
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
    public static boolean bs(int[]nums,int l,int r,int tar){
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > tar){
                r = mid - 1;
            }
            else if(nums[mid] < tar){
                l = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pvt = findPvt(nums);
        return (bs(nums,0,pvt-1,target) || bs(nums,pvt,n-1,target));
    }
}