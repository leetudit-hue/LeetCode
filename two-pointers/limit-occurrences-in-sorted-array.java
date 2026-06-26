class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer>ans = new ArrayList<>();
        int n = nums.length;
        int count = 1;
        ans.add(nums[0]);
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else {
                count = 1;
            }
            if(count <= k){
                ans.add(nums[i]);
            }
        }
        int x = ans.size();
        int[]arr = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}