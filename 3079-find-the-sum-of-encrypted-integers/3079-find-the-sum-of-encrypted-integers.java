class Solution {
    private int num(int n){
        int max = 0;
        while(n > 0)
        {
            int rem = n%10;
            max =  Math.max(max,rem);
            n /= 10;
        }
        return max;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=9) sum += nums[i];
            else if(nums[i]<=99) sum += num(nums[i])*11;
            else if(nums[i]<=999) sum += num(nums[i])*111;
            else sum += 1111;
        }
        return sum;
    }
}