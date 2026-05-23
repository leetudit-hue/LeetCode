class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer>ans = new ArrayList<>();
        for(int j = 0 ; j < n ; j++){
            if(nums[j] == key){
                int st = Math.max(0,j-k);
                int en = Math.min(n-1,j+k);
                if(ans.size()>=1 && ans.get(ans.size()-1) >= st){
                    st = ans.get(ans.size()-1) + 1;
                }
                while(st <= en){
                    ans.add(st);
                    st++;
                }
            }
        }
        return ans;
    }
}