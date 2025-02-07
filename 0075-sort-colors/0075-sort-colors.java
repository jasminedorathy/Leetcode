/*class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                      int temp = nums[j];
                      nums[j] = nums[j+1];
                      nums[j+1] = temp;
                }
            }
        }
       
    }
}*/

class Solution {
    public void sortColors(int[] nums) {
        int max ;
        int temp ;
        for(int i = nums.length - 1;  i >= 0 ; i--)
        {  max = 0;
            for(int j = 0 ; j <= i ; j++)
            { 
                if(nums[max] < nums[j])
                {
                    max = j;
                }
             }
        
            temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
         }
        }
}