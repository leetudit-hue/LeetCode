class Solution {

    public int countGoodRotations(int[] nums) {

        int n = nums.length;
        long total = 0;
        int count = 0;

        for (int num : nums) {
            total += num;
        }

        long half = 0;

        for (int i = 0; i < n / 2; i++) {
            half += nums[i];
        }

        for (int start = 0; start < n; start++) {

            if (total - half < half) {
                count++;
            }

            half -= nums[start];
            half += nums[(start + n / 2) % n];
        }

        return count;
    }
}