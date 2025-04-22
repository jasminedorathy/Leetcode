class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
       long  prefix_sum = 0;
       long max = 0;
       long min = 0;

       for(int diff:differences)
       {
        prefix_sum += diff;
        min = Math.min(min,prefix_sum);
        max = Math.max(max,prefix_sum);
       } 

       long low = lower - min;
       long high = upper - max;

       return (int)Math.max(0,high - low+1);
    }
}