class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int x = 0;
        for(int i : spaces){
            sb.insert(i+x,' ');
            x++;
        }
        return sb.toString();
    }
}