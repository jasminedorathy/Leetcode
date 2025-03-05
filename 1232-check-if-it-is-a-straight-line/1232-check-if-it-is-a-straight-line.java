class Solution {
 public boolean checkStraightLine(int[][] co) {
       
        int x1 = co[1][0] - co[0][0];
        int y1 = co[1][1] - co[0][1];
        
        for (int i = 2; i < co.length; i++) {
        
            int x2 = co[i][0] - co[i - 1][0];
            int y2 = co[i][1] - co[i - 1][1];
            
           
            if (x1 * y2 != y1 * x2) {
                return false; 
            }
        }
        return true; 
    }
}