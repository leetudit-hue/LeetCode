class Solution {
    int noOfDays(int[]w , int cap){
        int d = 1;
        int load = 0;
        for(int i = 0 ; i < w.length ; i++){
            if(load + w[i] > cap){
                d++;
                load = w[i];
            }
            else{
                load += w[i];
            }
        }
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = -1;
        int r = 0;
        int ans = -1;
        for(int num : weights){
            l = Math.max(l , num);
            r += num;
        }
        while(l <= r){
            int mid = l + (r - l) / 2;
            int dayss = noOfDays(weights , mid);
            if(dayss <= days){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}