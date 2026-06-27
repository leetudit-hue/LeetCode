class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        HashMap<Long,Integer>map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            long val = nums[i];
            if(map.containsKey(val)){
                map.put(val,(map.get(val)+1));
            }
            else{
                map.put(val,1);
            }
        }
        int max = 1;
        if(map.containsKey(1)){
            int one = map.get(1);
            if(one % 2 == 0){
                max = Math.max(max,one-1);
            }
            else{
                max = Math.max(max,one);
            }
        }
        for(long x : map.keySet()){
                if(x == 1) continue;
                if(map.get(x) < 2) continue;
                int length = 1;
                long curr = x;
                while(map.getOrDefault(curr,0) >= 2){
                    length +=2;
                    long sq = curr*curr;
                    if( sq > 1000000000L ) break;
                    curr = sq;
                }
                max = Math.max(max,length);
            }
        return max;
    }
}