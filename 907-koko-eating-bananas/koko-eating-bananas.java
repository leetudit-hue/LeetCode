class Solution {
    boolean canEat(int[]piles , int mid , int h){
        int hrs = 0;
        for(int i = 0 ; i < piles.length ; i++){
            hrs += piles[i] / mid;
            if(piles[i] % mid != 0){
                hrs += 1;
            }
        }
        return hrs <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = -1;
        for(int num : piles){
            r = Math.max(r,num);
        }
        while(l < r){
            int mid = l + (r - l) / 2;
            if(canEat(piles , mid , h)){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return r;
    }
}