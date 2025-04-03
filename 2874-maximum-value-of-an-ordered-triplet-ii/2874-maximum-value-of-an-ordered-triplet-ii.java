class Solution {
    public long maximumTripletValue(int[] nums) {
       long ans=0;
       int maxdiff=0;
       int maxnum=0;

       for(final int num: nums){
        ans=Math.max(ans,(long)maxdiff*num);
        maxdiff=Math.max(maxdiff,maxnum-num);
        maxnum=Math.max(maxnum,num);
       } 
       return ans;
    }
}