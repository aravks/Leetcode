class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int maxLocal[][]=new int[n-2][n-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int a=i+1, b=j+1;
                maxLocal[i][j]=0;
                for(int ii=a-1; ii<=a+1; ii++){
                    for(int jj=b-1; jj<=b+1; jj++){
                        if(maxLocal[i][j]<grid[ii][jj]) maxLocal[i][j]=grid[ii][jj];
                    }   
                }
            }
        }
        return maxLocal;
    }
}