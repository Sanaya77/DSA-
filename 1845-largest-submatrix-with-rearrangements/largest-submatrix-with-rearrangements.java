class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m= matrix.length;
        int n=matrix[0].length;
        int[][]heights=new int[m][n];

        for(int j=0;j<n;j++){
            heights[0][j]=matrix[0][j];
            for(int i=1;i<m;i++){
                if(matrix[i][j]==1){
                    heights[i][j]=heights[i-1][j]+1;
                }else{
                    heights[i][j]=0;
                }
            }
        }
        int area=0;
        for(int i=0;i<m;i++){
            int[]row=heights[i].clone();
            Arrays.sort(row);

            for(int l=0,r=n-1;l<r;l++,r--){
                int temp=row[l];
                row[l]=row[r];
                row[r]=temp;

            }
            for(int j=0;j<n;j++){
                int height=row[j];
                int width=j+1;
                area=Math.max(area, height*width);

            }
        }
        return area;
    }
}