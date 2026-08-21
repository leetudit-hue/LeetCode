class Solution {
    public void sortColors(int[] arr) {
         int n = arr.length;
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int num : arr){
            if(num == 0) zero++;
            else if(num == 1) one++;
            else two++;
        }
        for(int i = 0 ; i < zero ; i++){
            arr[i] = 0;
        }
        for(int i = zero ; i < n ; i++){
            arr[i] = 1;
        }
        for(int i = zero + one ; i < n ; i++){
            arr[i] = 2;
        }
    }
}
