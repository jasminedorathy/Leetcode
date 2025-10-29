class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
           nums[i] = nums[i] * nums[i]; 
        }
        Arrays.sort(nums);
        int mid = nums.length/2;
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<nums.length;i++){
            if(i < mid) s1 += nums[i];
            else s2 += nums[i];
        }
        return s2-s1;
    }
}