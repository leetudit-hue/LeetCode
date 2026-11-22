class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int count = 0;
        if(n > 1 && nums[0] >= nums[1]){
            count++;
        }
        if(n > 1 && nums[n-1] >= nums[n-2]){
            count++;
        }
        for(int i = 1 ; i < n - 1 ; i++){
            double avg = ((nums[i - 1] + nums[i + 1]) / 2.0);
            if(avg <= nums[i]){
                count++;
            }
        }
        return count;
    }
}