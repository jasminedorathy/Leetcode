class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        int sum = 0, minsum =0, maxsum = 0;
        for(int num: nums)
        {
            sum += num;
            if(sum > maxsum)
            {
                maxsum = sum;
            }

            if(sum < minsum)
            {
                minsum = sum;
            }
        }
        return Math.abs(maxsum - minsum);
    }
}