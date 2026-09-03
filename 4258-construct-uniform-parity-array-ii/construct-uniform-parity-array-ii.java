class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int mini = Integer.MAX_VALUE;
        for(int num : nums1){
            mini = Math.min(mini,num);
        }   
        if(mini % 2 != 0) return true;
        else{
            for(int num : nums1){
                if(num % 2 != 0){
                    return false;
                }
            }
            return true;
        }
    }
}