class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int oddC = 0;
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i = 0 ; i < n ; i++){
            if(nums[i] % 2 != 0){
                oddC++;
            }
            if(map.containsKey(oddC - k)){
                count += map.get(oddC - k);
            }
            if(map.containsKey(oddC)){
                map.put(oddC,map.get(oddC)+1);
            }
            else{
                map.put(oddC,1);
            }
        }
        return count;
    }
}