class Solution {
    public int subsetXORSum(int[] nums) {
        return calculateXORSum(nums, 0, 0);
    }

    private int calculateXORSum(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        int include = calculateXORSum(nums, index + 1, currentXOR ^ nums[index]);
        int exclude = calculateXORSum(nums, index + 1, currentXOR);
        
        return include + exclude;
    }
}
