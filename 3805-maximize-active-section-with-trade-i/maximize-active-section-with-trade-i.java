class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        ArrayList<Integer>arr = new ArrayList<>();
        int count = -1;
        int i = 0;
        while (i < n) {
            if(s.charAt(i) == '0') {
                count = 0;
                while (i < n && s.charAt(i) == '0') {
                    count++;
                    i++;
                }
                arr.add(count);
            } else {
                i++;
            }
        }
        int existingCount = 0;
        for(int j = 0 ; j < n ; j++){
            if(s.charAt(j) == '1') existingCount++;
        }
        int ans = 0;
        if(arr.size() >= 2){
            for(int j = 1 ; j < arr.size() ; j++){
                ans = Math.max(ans , (arr.get(j) + arr.get(j-1)));
            }
            ans = ans + existingCount;
            return ans;
        }
        else{
            return existingCount;
        }
    }
}