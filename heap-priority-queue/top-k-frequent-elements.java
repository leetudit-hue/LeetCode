class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>arr = new ArrayList<>(map.keySet());
        Collections.sort(arr,(a,b)->map.get(b)-map.get(a));
        int[]ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}