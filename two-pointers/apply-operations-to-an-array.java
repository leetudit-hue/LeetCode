class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                if(nums[i] == 0) continue;
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int ans[] = new int[nums.length];
        int nz = 0;
        int z = nums.length-1;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] == 0){
                ans[z] = 0;
                z--;
            }
            else{
                ans[nz] = nums[j];
                nz++;
            }
        }
        return ans;
    }
}