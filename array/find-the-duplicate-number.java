class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            if(set.contains(num)){
                return num;
            }
            else{
                set.add(num);
            }
        }
        return -1;
    }
}