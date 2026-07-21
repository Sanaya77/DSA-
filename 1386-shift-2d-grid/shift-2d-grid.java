class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;

        int total=m*n;
        k%=total;

        int[][]ans=new int[m][n];
        for(int i=0;i<total;i++){
            int newindex=(i+k)%total;
            ans[newindex/n][newindex%n]=grid[i/n][i%n];

        }
        List<List<Integer>> res=new ArrayList<>();

        for(int[]row:ans){
            List<Integer>list=new ArrayList<>();
            for(int num:row)
                list.add(num);
            res.add(list);
            }
            return res;
    }
}