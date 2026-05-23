class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        boolean used[] = new boolean[nums2.length];
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(nums1[i] == nums2[j] && !(used[j])){
                    result.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }
        int []ans = new int[result.size()];
        for(int i = 0 ; i < result.size() ; i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}