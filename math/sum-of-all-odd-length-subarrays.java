class Solution {
    public static int Sum(int[]arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int s = 0;
            int x = 1;
            for(int j = i ; j < n ; j++){
                s+=arr[j];
                if(x%2 != 0){
                    sum += s;
                }
                x++;
            }
        }
        return sum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = Sum(arr);
        return sum;
    }
}