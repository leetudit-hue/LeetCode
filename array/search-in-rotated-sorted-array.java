class Solution {
    static int binarySearch(int[] arr, int tar, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == tar) {
                return mid;
            } 
            else if (arr[mid] > tar) {
                end = mid - 1;
            } 
            else {
                st = mid + 1;
            }
        }
        return -1;
    }

    static int findPvt(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        // array not rotated
        if (arr[st] < arr[end]) {
            return -1;
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // pivot condition
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > st && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // search left/right
            if (arr[st] <= arr[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int pvt = findPvt(nums);

        // normal sorted array
        if (pvt == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // target is pivot
        if (nums[pvt] == target) {
            return pvt;
        }

        // left side
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pvt - 1);
        }

        // right side
        return binarySearch(nums, target, pvt + 1, nums.length - 1);
    }
}