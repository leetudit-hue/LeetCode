class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;
        int max = -1;
        int minMah = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int mah = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
            if(mah <= drones[i][2]){
                if(mah < minMah){
                    max = i;
                    minMah = mah;
                }
            }
        }
        return max;
    }
}