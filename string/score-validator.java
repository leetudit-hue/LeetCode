class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length;
        int score = 0;
        int counter = 0;
        for(int i = 0 ; i < n && counter < 10 ; i++){
            String s = events[i];
            if(s.equals("0")||s.equals("1")||s.equals("2")||
            s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")){
                score += Integer.valueOf(s);
            }
            else if(s.equals("W")){
                counter++;
            }
            else{
                score++;
            }
        }
        int[]ans = new int[2];
        ans[0] = score;
        ans[1] = counter;
        return ans;
    }
}