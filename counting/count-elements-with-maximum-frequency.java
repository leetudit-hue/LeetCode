class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]]++;
        }
        int max = 0;
        for(int i = 0 ; i < 101 ; i++){
            max = Math.max(max,arr[i]);
        }
        int sum = 0;
        for(int i = 0; i < 101 ; i++){
            if(arr[i] == max){
                sum += max;
            }
        }
        return sum;
    }
}