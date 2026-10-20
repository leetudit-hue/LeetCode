class Solution {
    int canMake(int[] BD , int k , int mid){
        int boqC = 0;
        int count = 0;
        for(int i = 0 ; i < BD.length ; i++){
            if(BD[i] <= mid){
                count++;
            }
            else{
                count = 0;
            }
            if(count == k){
                boqC++;
                count = 0;
            }
        }
        return boqC;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int startD = 0;
        int endD = -1;
        for(int num : bloomDay){
            endD = Math.max(endD , num);
        }
        int minD = -1;
        while(startD <= endD){
            int mid = startD + (endD - startD) / 2;
            if(canMake(bloomDay , k , mid) >= m){
                minD = mid;
                endD = mid - 1;
            }
            else{
                startD = mid + 1;
            }
        }
        return minD;
    }
}