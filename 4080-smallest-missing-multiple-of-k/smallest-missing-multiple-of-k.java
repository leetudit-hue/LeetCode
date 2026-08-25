class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int i = 0;
        while(st.contains(i+k)){
            i = i+k;
        }
        return i+k;
    }
}