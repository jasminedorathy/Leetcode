class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int [] i : tasks){
            min = Math.min(min, i[0] + i[1]);
        }
        return min;
    }
}