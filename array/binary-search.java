class Solution {
    static int binaryS(int[]arr,int target,int st ,int end){
        if(st > end){
            return -1;
        }
        int mid = st+(end-st)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid]<target) return binaryS(arr,target,mid+1,end);
        else return binaryS(arr,target,st,mid-1);
    }
    public int search(int[] nums, int target) {
        return binaryS(nums,target,0,nums.length-1);
    }
}