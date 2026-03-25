class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        long totalsum=0;

        for(int[]row:grid){
            for(int val:row){
                totalsum+=val;
            }
        }
        if(totalsum % 2 !=0)return false;
        long target=totalsum/2;
        long rowsum=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                rowsum+=grid[i][j];

            }
            if(rowsum==target)return true;
            
        }
        long colsum=0;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<m;i++){
                colsum+=grid[i][j];
            }
            if(colsum==target)return true;
        }
        return false;
    }
}