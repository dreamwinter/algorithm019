/**
 * @author libingc
 * @date 2020/11/25
 * @see "<herf a="https://leetcode-cn.com/problems/number-of-islands/">岛屿问题</a>"
 */
public class NumberOfIslands {
    //[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
    public int numIslands(char[][] grid) {
        //边界判断
        if(grid==null || grid.length==0) {
            return 0;
        }
        int height = grid.length;
        int width = grid[0].length;

        int num_islands = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(grid[i][j]=='1'){    //注意是一个char类型的数组
                    ++num_islands;
                    Convert(grid,i,j);
                }
            }
        }
        return num_islands;
    }

    //要转换垂直和水平方向的相邻的格子，否则会造成重复循环判断
    private void Convert(char[][] grid,int m,int n) {
        if (m < 0 || n < 0) return;
        if (m >= grid.length || n >= grid[0].length) return;
        if (grid[m][n] == '0') return;
        grid[m][n] = '0';
        Convert(grid, m - 1, n);
        Convert(grid, m + 1, n);
        Convert(grid, m, n - 1);
        Convert(grid, m, n + 1);
    }
    /*
    官方题解代码
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }
    * */
}
