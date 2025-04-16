class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        long result = 0;
        int pairs = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int right = 0; right < n; right++) {
            int rightNum = nums[right];
            int rightFreq = freqMap.getOrDefault(rightNum, 0);
            pairs += rightFreq;
            freqMap.put(rightNum, rightFreq + 1);

            while (pairs >= k) {
                result += (n - right);
                int leftNum = nums[left];
                int leftFreq = freqMap.get(leftNum);
                pairs -= (leftFreq - 1);
                freqMap.put(leftNum, leftFreq - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                left++;
            }
        }

        return result;
    }
}