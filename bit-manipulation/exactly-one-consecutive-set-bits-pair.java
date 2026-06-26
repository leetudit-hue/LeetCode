class Solution {
    public boolean consecutiveSetBits(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        Stack<Character>st = new Stack<>();
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i)=='1'){
                if(!st.isEmpty()){
                    if(st.peek() == '1'){
                        count++;
                    }
                }
            }
            st.push(binary.charAt(i));
            if(count > 1) return false;
        }
        if(count == 1) return true;
        return false;
    }
}