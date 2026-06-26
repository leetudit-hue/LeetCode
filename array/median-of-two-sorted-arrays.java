class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int el1 = Integer.MAX_VALUE;
        int el2 = Integer.MAX_VALUE;
        int k1 = (m+n)/2;
        int k2 = (m+n)/2-1;
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < n && j < m){
            if(nums1[i]<nums2[j]){
                if(idx == k1){
                    el1 = nums1[i];
                }
                if(idx == k2){
                    el2 = nums1[i];
                }
                i++;
            } 
            else{
                if(idx == k1){
                    el1 = nums2[j];
                }
                if(idx == k2){
                    el2 = nums2[j];
                }
                j++;
            }
            idx++;
        }
        while(i < n){
            if(idx == k1){
                el1 = nums1[i];
            }
            if(idx == k2){
                el2 = nums1[i];
            }
            i++;
            idx++;
        }
        while(j < m){
            if(idx == k1){
                el1 = nums2[j];
            }
            if(idx == k2){
                el2 = nums2[j];
            }
            j++;
            idx++;
        }
        int size = m+n;
        if(size%2 != 0){
            return el1;
        }
        else{
            return (el1+el2)/2.0;
        }
    }
}