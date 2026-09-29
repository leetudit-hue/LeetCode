class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int idx = 0;
        while (idx < n) {
            HashSet<Integer> st = new HashSet<>();
            ArrayList<Integer>arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if(nums[i] != -1 && !st.contains(nums[i])) {
                    st.add(nums[i]);
                    nums[i] = -1;
                }
            }
            for(int num : st){
                arr.add(num);
            }
            Collections.sort(arr);
            for(int x : arr){
                ans[idx++] = x;
            }
        }
        return ans;
    }
}