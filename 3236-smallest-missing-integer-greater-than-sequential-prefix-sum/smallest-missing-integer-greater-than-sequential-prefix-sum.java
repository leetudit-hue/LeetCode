class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int Ssum = nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[i-1]+1){
                Ssum += nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer>st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        while(st.contains(Ssum)){
            Ssum++;
        }
        return Ssum;
    }
}