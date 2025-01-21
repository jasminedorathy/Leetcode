class Solution {
    public int reverse(int x) {
        int rem;
        long s= 0;

        while(x!=0)
        {
            rem = x % 10;
            s = s*10 + rem;
            x = x/10;
      

        }
        return(s < Integer.MIN_VALUE || s > Integer.MAX_VALUE ) ? 0 : (int)s;
    }
}