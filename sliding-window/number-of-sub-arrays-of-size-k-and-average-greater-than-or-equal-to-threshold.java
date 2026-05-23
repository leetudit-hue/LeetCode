class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int c = 0;
        int target = threshold*k;
        for(int i = 0 ; i < k ; i++){
            sum+=arr[i];
        }
        if(sum >= target){
            c++;
        }
        for(int j = k ; j < arr.length ; j++){
            sum += arr[j];
            sum -= arr[j-k];
            if(sum >= target){
                c++;
            }
        }
        return c;
    }
}