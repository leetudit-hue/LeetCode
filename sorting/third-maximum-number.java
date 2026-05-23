class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>st = new HashSet();                           for(int i = 0 ; i < nums.length ; i++){
            st.add(nums[i]);
        }
        List<Integer>arr = new ArrayList<>(st);
        Collections.sort(arr);
        int n = arr.size();
        if(n < 3){
            return arr.get(n-1);
        }
        else{
            return arr.get(n-3);
        }
    }
}