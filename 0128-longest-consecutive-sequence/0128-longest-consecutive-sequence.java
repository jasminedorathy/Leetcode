class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null)
        return 0;
        
        int n = nums.length;
        int count = 1;
        int longest=1;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i] == nums[i-1])
            {
        continue;
         }
            if(nums[i] == nums[i-1]+1)
            count++;
            else if(nums[i] != nums[i-1]){

            
            longest = Math.max(count,longest);
            count=1;
            }
        }
       
        return Math.max(longest,count);
    }
}