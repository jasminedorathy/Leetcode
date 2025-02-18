class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num)
    {
        return (int)Math.log10(num)+1;
    }
    
    }
