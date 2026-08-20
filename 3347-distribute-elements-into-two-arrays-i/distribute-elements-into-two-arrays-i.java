class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        if(n < 1) return new int[]{};
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int a1 = 0;
        int a2 = 0;
        for(int i = 2 ; i < n ; i++){
            if(arr1.get(a1) > arr2.get(a2)){
                arr1.add(nums[i]);
                a1++;
            }
            else{
                arr2.add(nums[i]);
                a2++;
            }
        }
        int[]ans = new int[n];
        int x = 0;
        for(int num : arr1){
            ans[x++] = num;
        }
        for(int num : arr2){
            ans[x++] = num;
        }
        return ans;
    }
}