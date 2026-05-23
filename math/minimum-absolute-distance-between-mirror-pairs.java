class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int x = nums[i];
            if(map.containsKey(x)){
                ans = Math.min(ans,(i-map.get(x)));
            }
            x = rev(x);
            map.put(x,i);
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
    public static int rev(int x){
        int rev = 0;
        while(x > 0){
            int ld = x%10;
            rev = rev*10+ld;
            x/=10;
        }
        return rev;
    }
}