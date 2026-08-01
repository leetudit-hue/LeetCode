class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            boolean even = ((n - mid) % 2 != 0);
            if(nums[mid] == nums[mid + 1]){
                if(even){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else if(nums[mid] != nums[mid + 1]){
                if(even){
                    r = mid;
                }
                else{
                    l = mid + 1;
                }
            }
        }
        return nums[l];
    }
}