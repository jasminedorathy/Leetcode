class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,close=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=="(".charAt(0))
            {
                open++;
            }
            else if(s.charAt(i)==")".charAt(0))
            {
                if(open>0)
                {
                    open--;
                    continue;
                }
                close++;
            }
        }
        return open+close;
    }
}