class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int i = 0 ; 
        int j = n;
        int count = 0;
        for(int k = 0 ; k < n ; k++){
            ans[count] = nums[i];
            ans[count+1] = nums[j];
            i++;
            j++;
            count+=2;
        }
        return ans;
    }
}