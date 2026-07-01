class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int i = 0;
        while(i < n){
            pq.add(nums[i]);
            if(i >= k){
                pq.remove();
            }
            i++;
        }
        return pq.peek();
    }
}