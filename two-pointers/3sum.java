class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>>ans = new HashSet<>();
        for(int i = 0 ; i <= nums.length-3 ; i++){
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                if(nums[i]+nums[l]+nums[r] == 0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r] > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}