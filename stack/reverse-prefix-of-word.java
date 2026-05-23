class Solution {
    public String reversePrefix(String word, char ch) {
        int fo = word.indexOf(ch);
        if(fo == -1) return word;
        Stack<Character>st = new Stack<>();
        for(int i = 0 ; i <= fo ; i++){
            st.push(word.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        for(int i = (fo+1) ; i < word.length() ; i++){
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}