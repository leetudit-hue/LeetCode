class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            char[]arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String neww = new String(arr);
            if(map.containsKey(neww)){
                map.get(neww).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(neww, list);
            }
        }
        List<List<String>>ans = new ArrayList<>();
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}