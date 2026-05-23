import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(score[i],i);
        }
        String[]ans = new String[n];
        Arrays.sort(score);
        for(int j = n-1 ; j >= 0 ; j--){
            int rank = n-j;
            if(rank == 1){
                ans[map.get(score[j])] = "Gold Medal";
            }
            else if(rank == 2){
                ans[map.get(score[j])] = "Silver Medal";
            }
            else if(rank == 3){
                ans[map.get(score[j])] = "Bronze Medal";
            }
            else{
                ans[map.get(score[j])] = Integer.toString(rank);
            }
        }
        return ans;
    }
}