class Solution {
    public String evaluate(String s, List<List<String>> know) {
        HashMap<String,String>map = new HashMap<>();
        for(int i = 0 ; i < know.size() ; i++){
            for(int j = 0 ; j < 2 ; j++){
                map.put(know.get(i).get(0) , know.get(i).get(1));
            }
        }
        int i = 0 ;
        int n = s.length();
        String res = "";
        while(i < n){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                res += s.charAt(i);
            }
            else if(s.charAt(i) == '('){
                i++;
                StringBuilder temp = new StringBuilder();
                while(i < n && s.charAt(i) != ')'){
                    temp.append(s.charAt(i));
                    i++;
                }
                if(map.containsKey(temp.toString())){
                    res += map.get(temp.toString());
                }
                else{
                    res+='?';
                }
            }
            i++;
        }
        return res;
    }
}