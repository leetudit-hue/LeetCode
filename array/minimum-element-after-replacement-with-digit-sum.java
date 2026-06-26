class Solution {
    static int sum(int x){
        int sum = 0;
        while(x!=0){
            int ld = x%10;
            sum+=ld;
            x = x/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int[]arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            int x = sum(nums[i]);
            arr[i] = x;
            min = Math.min(min,x);
        }
        return min;
    }
}