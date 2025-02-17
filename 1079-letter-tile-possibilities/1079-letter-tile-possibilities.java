class Solution {
    private int bulidChar(int [] charCount) {
        int totalCount = 0;
        for(int i=0;i<26;i++)
        {
            if(charCount[i] > 0)
            {
                totalCount++;
                charCount[i]--;
                totalCount += bulidChar(charCount);
                charCount[i]++;
            }
        }
        return totalCount;
    }
    public int numTilePossibilities(String titles)
    {
        int[] charCount = new int[26];
        for(char ch : titles.toCharArray())
        {
            charCount[ch - 'A']++;
        }
        return bulidChar(charCount);
    }
}