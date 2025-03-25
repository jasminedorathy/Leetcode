class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=9) sum += nums[i];
            else if(nums[i]<=99) {
                nums[i] = nums[i]/10;
                sum += nums[i]*11;
            }
             else if(nums[i]<=999) {
                nums[i] = nums[i]/100;
                sum += nums[i]*111;
            }
            else sum += 1111;
        }
        return sum;
    }
}