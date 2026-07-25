class Solution {
    public int maxProduct(int n) {
        int m1 = Integer.MIN_VALUE;
        int m2 = m1;
        while(n > 0){
            int last = n % 10;
            if(last >= m1){
                m2 = m1;
                m1 = last;
            }
            else if(last > m2){
                m2 = last;
            }
            n /= 10;
        }
        return m1 * m2;
    }
}