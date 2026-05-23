class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String>st = new HashSet<>();
        for(List<String> path : paths){
            st.add(path.get(0));
        }
        for(List<String>dest : paths){
            if(!st.contains(dest.get(1))){
                return dest.get(1);
            }
        }
        return "";
    }
}