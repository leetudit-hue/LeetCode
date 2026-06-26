class Solution {
    static void getAllSub(int[]arr,List<Integer>ans,List<List<Integer>>res,int i){
        if(i == arr.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        getAllSub(arr,ans,res,i+1);
        ans.removeLast();
        int idx = i+1;
        while(idx < arr.length && arr[idx] == arr[idx-1]){
            i++;
            idx++;
        }
        getAllSub(arr,ans,res,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ans = new ArrayList<>();
        List<List<Integer>>res = new ArrayList<>();
        getAllSub(nums,ans,res,0);
        return res;
    }
}