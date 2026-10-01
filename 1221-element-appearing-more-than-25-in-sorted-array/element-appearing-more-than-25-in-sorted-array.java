class Solution {
    public int findSpecialInteger(int[] arr) {
        double n = (double)arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        double per = n * 1/4;
        for(int val : map.keySet()){
            if(map.get(val) > per){
                return val;
            }
        }
        return -1;
    }
}