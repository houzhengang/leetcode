package 剑指;

public class maxValue47 {
    public int maxValue(int[][] grid) {

        int lenx = grid.length;
        int leny =grid[0].length;
        for (int i= 1;i<lenx;i++){
            grid[0][i] += grid[0][i-1];

        }
        for (int i= 1;i<leny;i++){
            grid[i][0] += grid[i-1][0];

        }
        for(int i=1;i<lenx;i++){
            for (int j=1;j<leny;j++){

                    grid[i][j]= Math.max(grid[i-1][j],grid[i][j-1])+grid[i][j];

            }
        }
        return grid[lenx-1][leny-1];
    }

}
