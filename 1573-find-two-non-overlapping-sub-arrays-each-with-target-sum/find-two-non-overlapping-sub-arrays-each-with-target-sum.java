class Solution {

    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;

        int i = 0;
        int cSum = 0;

        int res = Integer.MAX_VALUE;
        int minBest = Integer.MAX_VALUE;

        int[] minTillIdx = new int[n];

        for (int j = 0; j < n; j++) {

            // Add the right end of the window
            cSum += arr[j];

            // Shrink window if sum becomes too large
            while (i <= j && cSum > target) {
                cSum -= arr[i];
                i++;
            }

            // Found a subarray with sum == target
            if (cSum == target) {

                int len = j - i + 1;

                // Combine with the best previous non-overlapping subarray
                if (i > 0 && minTillIdx[i - 1] != Integer.MAX_VALUE) {
                    res = Math.min(res, len + minTillIdx[i - 1]);
                }

                minBest = Math.min(minBest, len);
            }

            // Best subarray found up to index j
            minTillIdx[j] = minBest;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}