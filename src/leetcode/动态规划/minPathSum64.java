package leetcode.动态规划;

import java.util.Arrays;

public class minPathSum64 {
    public static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(i==0&&j==0){
                    continue;

                }else if(i==0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                }else if(j==0){
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                }else{
                    grid[i][j]=Math.min(grid[i-1][j]+grid[i][j],grid[i][j-1]+grid[i][j]);
                }

            }
        }
        System.out.println(Arrays.deepToString(grid));
        return grid[m-1][n-1];


    }
    public static void main(String[] args) {
        int[][] a={{1,3,1},{4,5,1},{4,2,1}};
        int res = minPathSum(a);
        System.out.println(res);
    }
}
