class Solution {
    public int minimumPushes(String word) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = word.length();
        int mark = 2;
        int round = 0;
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(mark)){
                map.put(mark , (map.get(mark) + round + 1));
            }
            else{
                map.put(mark , 1);
            }
            mark++;
            if(mark > 9) {
                mark = 2;
                round++;
            }
        }
        int ans = 0;
        for(int key : map.keySet()){
            ans += map.get(key);
        }
        return ans;
    }
}