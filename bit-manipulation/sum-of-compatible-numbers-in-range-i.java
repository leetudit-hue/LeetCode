class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int st = Math.max(1,n-k);
        int end = n+k;
        int sum = 0;
        for(int i = st ; i <= end ; i++){
            if(Math.abs(i - n) <= k && (n&i) == 0){
                sum+=i;
            }
        }
        return sum;
    }
}