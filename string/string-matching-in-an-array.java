class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String>ans = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            String s = words[i];
            for(int j = 0 ; j < words.length ; j++){
                String temp = words[j];
                if(i != j && temp.contains(s)){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}