class Solution {
    public static int Reverse(int n){
        int rev = 0;
        while(n > 0){
            int ld = n % 10;
            rev = rev*10 + ld;
            n/=10;
        }
        return rev;
    }
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2 ; i*i <= n ; i++){
            if( n % i == 0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int r = Reverse(n);
        int low = Math.min(n,r);
        int high = Math.max(n,r);
        int sum = 0;
        for(int i = low ; i <= high ; i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}