class Solution {
    public int findFirst(int[]a,int target){
        int ans = -1;
        int l = 0;
        int r = a.length-1;
        while(l <= r){
            int mid = r-(r-l)/2;
            if(a[mid]<target){
                l = mid+1;
            }
            else if(a[mid]>target){
                r = mid-1;
            }
            else{
                ans = mid;
                r = mid-1;
            }
        }
        return ans;
    }
    public int findLast(int[]a,int target){
        int n = a.length;
        int l = 0;
        int r = a.length-1;
        int ans = -1;
        while(l <= r){
            int mid = r-(r-l)/2;
            if(a[mid]<target){
                l = mid+1;
            }
            else if(a[mid]>target){
                r = mid-1;
            }
            else{
                ans = mid;
                l = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[] {first,last};
    }
}