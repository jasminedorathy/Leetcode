class Solution {
    public int countLargestGroup(int n) {
        if(n > 9) return n - 9;
        else return n;
    }
}