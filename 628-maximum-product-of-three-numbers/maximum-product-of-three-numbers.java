class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;
        int fmin = Integer.MAX_VALUE;
        
        for(int i =  0 ; i < nums.length ; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second){
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third){
                third = nums[i];
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < fmin){
                smin = fmin;
                fmin = nums[i];
            }
            else if(nums[i] < smin){
                smin = nums[i];
            }
        }
        int p1 = (first * second * third);
        int p2 = (fmin * smin * first);
        return Math.max(p1,p2);
    }
}