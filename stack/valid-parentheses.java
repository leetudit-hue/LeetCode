 class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        char[]a = s.toCharArray();
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == '(' || a[i] == '{' || a[i] == '['){
                st.push(a[i]);
            }
            else if(a[i] == ')' && (st.isEmpty() || st.pop()!='(')) return false;
            else if(a[i] == '}' && (st.isEmpty() || st.pop()!='{')) return false;
            else if(a[i] == ']' && (st.isEmpty() || st.pop()!='[')) return false;
        }
        return st.isEmpty();
    }
}