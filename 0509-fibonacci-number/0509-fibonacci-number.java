class Solution {
    public int fib(int n) {
       if(n<2)
       {
        return n;
       }
       
    int [] d = {0,0,1};
    for(int i = 2;i<=n;i++)
    {
        d[0] = d[1];
        d[1] = d[2];
        d[2] = d[0] + d[1];
    }

    return d[2];

    }
}