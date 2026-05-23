class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int n = arr.length;
        int r = arr.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if((mid-1 >= 0 && arr[mid]>arr[mid-1]) && (mid+1<n && arr[mid]>arr[mid+1] )){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
}