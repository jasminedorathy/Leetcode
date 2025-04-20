class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        if(nums.length >= k) {
            for(int i = 0; i < k; i++) {
                sum += nums[i];
            }
            
            int max = sum;
            
            for(int j = k; j < nums.length; j++) {
                sum = sum - nums[j - k] + nums[j];
                if(sum > max) {
                    max = sum;
                }
            }
            
            return (double) max / k;
        } else {
            return -1;
        }
    }
}