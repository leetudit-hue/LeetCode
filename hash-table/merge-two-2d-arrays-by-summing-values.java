class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<int[]>ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else if(nums2[j][0]<=nums1[i][0]){
                ans.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i < n){
            ans.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j < m){
            ans.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        int[][]res = new int [ans.size()][2];
        for(int k = 0 ; k < ans.size() ; k++){
            res[k] = ans.get(k); 
        }
        return res;
    }
}