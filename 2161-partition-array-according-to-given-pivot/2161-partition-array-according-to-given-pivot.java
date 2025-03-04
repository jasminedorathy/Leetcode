class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int result[] = new int[nums.length];
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                result[left] = nums[i];
                left++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                result[left] = nums[i];
                left++;
            }
        }

        return result;
    }
}
