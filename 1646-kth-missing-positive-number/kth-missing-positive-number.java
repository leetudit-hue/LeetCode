class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int i = 0;
        int n = arr.length;
        int org = k;
        while(i < n){
            if(arr[i] != num){
                while(arr[i] != num){
                    k--;
                    if(k == 0) return num;
                    num++;
                }
                num++;
            }
            else{
                num++;
            }
            i++;
        }
        return num + k - 1;
    }
}