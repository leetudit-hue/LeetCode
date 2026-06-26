class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i <= j){
            if(nums[i] == 0 && nums[j]!=0){
                count++;
                i++;
                j--;
            }
            else if(nums[i] == 0 && nums[j] == 0){
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }
}