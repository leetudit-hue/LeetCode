class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        HashSet<Integer>set = new HashSet<>();
        int z = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0) z++;
            set.add(arr[i]);
        }
        for(int i = 0 ; i < n ; i++){
            int key = 2*arr[i];
            if(key == 0 && z < 2) continue;
            if(set.contains(key)){
                return true;
            }
        }
        return false;
    }
}