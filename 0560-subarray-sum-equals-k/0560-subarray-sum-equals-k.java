class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int count = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = prefix[end] - (start > 0 ? prefix[start - 1] : 0);
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
