class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int num : nums) {
            long val = num;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int max = 1;

        if (map.containsKey(1L)) {
            int one = map.get(1L);
            max = Math.max(max, one % 2 == 0 ? one - 1 : one);
        }

        for (long x : map.keySet()) {
            if (x == 1L) continue;
            if (map.get(x) < 2) continue;

            long root = (long) Math.sqrt(x);
            if (root * root == x && map.getOrDefault(root, 0) >= 2) continue;

            int length = 1;
            long curr = x;

            while (map.getOrDefault(curr, 0) >= 2) {
                long sq = curr * curr;
                // sq exist karna chahiye next step ke liye
                if (sq > 1_000_000_000L || map.getOrDefault(sq, 0) == 0) break; // ✅
                length += 2;
                curr = sq;
            }

            max = Math.max(max, length);
        }

        return max;
    }
}