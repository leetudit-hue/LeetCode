class Solution {
    public int minAddToMakeValid(String s) {
        int size = 0;
        int open = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                size++;
            }
            else if(size == 0){
                open++;
            }
            else{
                size--;
            }
        }
        return size + open;
    }
}