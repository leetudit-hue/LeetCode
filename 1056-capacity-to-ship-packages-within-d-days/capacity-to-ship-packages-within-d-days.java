class Solution {
    int noOfDays(int[]w,int c){
        int days = 1;
        int load = 0;
        for(int i = 0 ; i < w.length ; i++){
            if(load + w[i] > c){
                days++;
                load = w[i];
            }
            else{
                load += w[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : weights){
            max = Math.max(max,num);
            sum += num;
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            int day = noOfDays(weights,mid);
            if(day <= days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}