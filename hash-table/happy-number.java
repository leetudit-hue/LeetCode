class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>used = new HashSet<>();
        while(true){
        int sum = 0;
        while(n!=0){
            int d = n %10;
            sum+=d*d;
            n = n/10;
        }
        if(sum == 1){
            return true;
        }
        n = sum;
        if(used.contains(n)){
            return false;
        }
        used.add(n);
        }
    }
}
