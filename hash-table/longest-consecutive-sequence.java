class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            int x = num;
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    num = num+1;
                }
            }
            longest = Math.max(longest,num-x+1);
        }
        return longest;
    }
}