class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(j < n){
            int num = fruits[j];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
            if(map.size()>2){
                int m = map.get(fruits[i]);
                if(m > 1){
                    map.put(fruits[i],m-1);
                }
                else{
                    map.remove(fruits[i]);
                }
                i++;
            }
            else{
                ans = Math.max(ans,j-i+1);
            }
            j++;
        }
        return ans;
    }
}