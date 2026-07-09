class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int i = 0;
        int j = n-1;
        for(int k = 0 ; k < n ; k++){
            if(nums[k] > 0){
                temp[i++] = nums[k];
            }
            else{
                temp[j--] = nums[k];
            }
        }
        i = 0;
        j = n-1;
        int k = 0;
        while(i < j){
            nums[k] = temp[i++];
            nums[k+1] = temp[j--];
            k += 2;
        }
        return nums;
    }
}