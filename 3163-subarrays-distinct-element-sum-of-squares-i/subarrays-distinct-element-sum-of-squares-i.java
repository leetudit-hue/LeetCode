class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            HashSet<Integer>st = new HashSet<>();
            for(int j = i ; j < nums.size() ; j++){
                for(int k = i ; k <= j ; k++){
                    st.add(nums.get(k));
                }
                ans += (st.size() * st.size());
            }
        }
        return ans;
    }
}