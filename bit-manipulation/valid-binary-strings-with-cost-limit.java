class Solution {
    static List<String> getAll(int n, List<String>list , StringBuilder s){
        if(s.length() == n){
            list.add(s.toString());
            return list;
        }
        s = s.append('0');
        getAll(n,list,s);
        s.deleteCharAt(s.length()-1);
        s.append('1');
        getAll(n,list,s);
        s.deleteCharAt(s.length()-1);
        return list;
    }
    public List<String> generateValidStrings(int n, int k) {
        List<String>list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        list = getAll(n,list,s);
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).contains("11")){
                list.remove(i);
                i--;
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            int cost = 0;
            String stt = list.get(i);
            for(int j = 0 ; j < stt.length() ; j++){
                if(stt.charAt(j) == '1'){
                    cost+=j;
                }
            }
            if(cost > k){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}