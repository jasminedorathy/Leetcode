class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowcount [] = new int[m];
        int columncount [] = new int[n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    rowcount [i]++;
                    columncount [j]++;
                }
            } 
        }
        int cnt=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    if(rowcount[i]>1 || columncount[j] > 1)
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;       
    }
}