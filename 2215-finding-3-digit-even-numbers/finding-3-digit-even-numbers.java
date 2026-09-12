class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer>st = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                for(int k = 0 ; k < n ; k++){
                    if(digits[i] == 0 || i == j || j == k || i == k){
                        continue;
                    }
                    int num = (digits[i] * 100) + (digits[j] * 10) + (digits[k] * 1);
                    if(num >= 100 && num % 2 == 0){
                        st.add(num);
                    }
                }
            }
        }
        int[]ans = new int[st.size()];
        int idx = 0;
        for(int num : st){
            ans[idx++] = num;
        }
        Arrays.sort(ans);
        return ans;
    }
}