class Solution {
    static int bs(int n , int[]nums){
        int st = 0;
        int end = nums.length-1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(nums[mid] == n){
                return nums[mid];
            }
            else if(nums[mid]>n){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        for(int i = 0 ; i < n ; i++){
            int ans = bs(nums1[i],nums2);
            if(ans!=-1){
                return ans;
            }
        }
        return -1;
    }
}