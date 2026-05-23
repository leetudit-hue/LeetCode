class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int o = 0;
        for(int i = 0 ; i < n ; i+=3){
            if(check(i,nums) == true){
                return o;
            }
            else{
                o++;
            }
        }
        return o;
    } 
    public static boolean check(int j,int[]nums){
            Set<Integer>st = new HashSet<>();
            for(int i = j ; i < nums.length ; i++){
                if(st.contains(nums[i])){
                    return false;
                }
                st.add(nums[i]);
            }
            return true;
        } 
}