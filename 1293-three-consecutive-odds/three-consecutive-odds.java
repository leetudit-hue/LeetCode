class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int oddC = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 == 1){
                oddC++;
            }
            else{
                oddC = 0;
            }
            if(oddC == 3) return true;
        }
        return false;
    }
}