class Solution {
    public int secondHighest(String s) {
        int max1 = -1,max2 = -1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                int a = s.charAt(i)-'0';
                if(a > max1)
                {
                    max2 = max1;
                    max1 = a;
                }
                else if(a>max2 && a!=max1){
                    max2=a;
                }
            }
        }
        return max2;
    }
}