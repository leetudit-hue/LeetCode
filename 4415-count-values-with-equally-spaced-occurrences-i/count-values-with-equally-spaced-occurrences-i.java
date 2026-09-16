class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],(map.get(nums[i]))+1);
            }
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                for(int k = 0 ; k < n ; k++){
                    if(i < j && j < k){
                        if(nums[i] == nums[j] && nums[j] == nums[k] && j - i == k-j){
                            if(map.get(nums[i]) == 3) count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}