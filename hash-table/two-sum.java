class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans = new int[2];
        HashMap<Integer,Integer>mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int s = target - nums[i];
            if(mp.containsKey(s)){
                ans[0] = i;
                ans[1] = mp.get(s);
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}