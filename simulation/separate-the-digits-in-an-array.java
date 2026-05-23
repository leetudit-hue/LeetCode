class Solution {
    public int[] separateDigits(int[] nums) {
        int nu = nums.length;
        ArrayList<Integer>temp = new ArrayList<>();
        for(int i = 0 ; i < nu ; i++){
            ArrayList<Integer>tempp = new ArrayList<>();
            int n = nums[i];
            while(n > 0){
                int ld = n%10;
                tempp.add(ld);
                n/=10;
            }
            for(int j = tempp.size()-1 ; j >= 0 ; j--){
                temp.add(tempp.get(j));
            }
        }
        int res[] = new int[temp.size()];
        int idx = 0;
        for(int x : temp){
            res[idx++] = x;
        }
    return res;
    }
}