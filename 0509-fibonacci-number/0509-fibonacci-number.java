class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if(n==0)
        {
            return 0;
        }
        else{
        for (int i=2;i<=n;i++)
        {
            int c = b;
            b = b+a;
            a=c;
        }
        return b;
        }
        
    }
}