class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map = new HashMap<>();
        int n = strs.length;
        for(int i = 0 ; i < n ; i++){
            String word = strs[i];
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            // for(int j = 0 ; j < arr.length; j++){
            //     key+=arr[j];
            // }
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
                map.get(key).add(word);
            }
            else{
                map.get(key).add(word);
            }
        }
        return new ArrayList<>(map.values());
   }
}