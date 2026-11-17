class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        HashSet<Integer>st = new HashSet<>(); 
        for(int num : nums){
            st.add(num);
        }
        int s = Integer.MIN_VALUE;
        int maxLen = 1;
        for(int num : st){
            int len = 1;
            if(st.contains(num - 1)){
                continue;
            }
            s = num;
            while(st.contains(s + 1)){
                s = s + 1;
                len++;
            }
            maxLen = Math.max(maxLen , len);
        }
        return maxLen;
    }
}