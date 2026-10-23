class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int temp[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                temp[idx++] = nums1[i++];
            }
            else{
                temp[idx++] = nums2[j++];
            }
        }
        while(i < n1){
            temp[idx++] = nums1[i++];
        }
        while(j < n2){
            temp[idx++] = nums2[j++];
        }
        int size = temp.length;
        if(size % 2 != 0){
            return (double)temp[size / 2];
        }
        else{
            return (temp[size / 2] + temp[size / 2 - 1]) / 2.0;
        }
    }
}