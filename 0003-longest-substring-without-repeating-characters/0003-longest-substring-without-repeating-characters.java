class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index[] = new int[128];
        char [] chars = s.toCharArray();
        int start = 0;
        int maxLength = 0;

        for(int i=0;i<chars.length;i++)
        {
            char current = chars[i];
            start = Math.max(start,index[current]);
            maxLength = Math.max(maxLength,i-start+1);
            index[current] = i+1;
        }
        return maxLength;
    }
}