class Solution {
    public int minimumDistance(int[] nums) {
        
        int res = Integer.MAX_VALUE;;
        int n = nums.length;
        boolean change = false;
        if(n < 3) return -1;
        for(int i = 0 ; i < n-2 ; i++){
            for(int j = i+1 ; j < n-1 ; j++){
                if(nums[i]!=nums[j]) continue;
                for(int k = j+1 ; k < n ; k++){
                    if(nums[k] == nums[j]){
                        res = Math.min(res,2*(k-i));
                        change = true;
                        break;
                    }
                }
            }
        }
        if(!change) return -1;
        return res;
    }
}