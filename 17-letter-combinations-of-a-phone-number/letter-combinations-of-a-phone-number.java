class Solution {
    public static void solve(int idx , String str , String temp , HashMap<Character,String>map,List<String>ans){
        if(idx >= str.length()){
            ans.add(temp);
            return;
        }
        char ch = str.charAt(idx);
        String s = map.get(ch);
        for(int i = 0 ; i < s.length() ; i++){
            temp += s.charAt(i);
            solve(idx+1,str,temp,map,ans);
            temp = temp.substring(0,temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        int n = digits.length();
        HashMap<Character,String>map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        solve(0,digits,"",map,ans);
        return ans;
    }
}