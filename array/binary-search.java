class Solution {
    public int binarySearch(int[]a,int t,int l ,int r){
        int mid = l+(r-l)/2;
        if(l > r){
            return -1;
        }
        if(a[mid] == t){
            return mid;
        }
        else if(a[mid]>t){
            return binarySearch(a,t,l,mid-1);
        }
        else{
            return binarySearch(a,t,mid+1,r);
        }
    }
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        return binarySearch(nums,target,l,r);
    }
}