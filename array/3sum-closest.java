class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int resultSum = 0;
       int minDif = Integer.MAX_VALUE;
       for(int i = 0 ; i < nums.length-2 ; i++){
            int l =i+1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == target) return sum;
                else if(sum < target){
                    l++;
                }
                else {
                    r--;
                }
                int dif = Math.abs(sum - target);
                if(dif < minDif){
                    minDif = dif;
                    resultSum = sum;
                }
            }
       }
       return resultSum;
    }
}