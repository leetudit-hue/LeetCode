class Solution {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void getAllP(int[] arr, int idx, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> temp = new ArrayList<>();

            for (int num : arr) {
                temp.add(num);
            }

            ans.add(temp);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, i, idx);

            getAllP(arr, idx + 1, ans);

            swap(arr, i, idx); // backtrack
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        getAllP(nums, 0, ans);

        return ans;
    }
}