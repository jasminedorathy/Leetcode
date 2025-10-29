class Solution {
    public int smallestNumber(int n) {
        int c=0;
        while(n>0){
            c++;
            n/=2;
        }
        return (int)Math.pow(2,c)-1;
    }
}