class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer>st = new HashSet<>(Arrays.asList(2,3,5,7,11,13,19,21,17,23,29,31));
        int count = 0;
        for(int i = left ; i <= right ; i++){
            int setBit = Integer.bitCount(i);
            if(st.contains(setBit)){
                count+=1;
            }
        }
        return count;
    }
}