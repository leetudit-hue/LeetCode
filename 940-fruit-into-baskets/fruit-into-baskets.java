class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int i = 0;
        int j = 0;
        int res = 0;
        while(j < n){
            int x = fruits[j];
            if(map.containsKey(x)){
                map.put(x,map.get(x) + 1);
            }
            else{
                map.put(x,1);
            }
            if(map.size() <= 2){
                res = Math.max(res , j - i + 1);

            }
            else{
                map.put(fruits[i] , map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            j++;
        }
        return res;
    }
}