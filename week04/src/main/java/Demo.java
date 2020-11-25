/**
 * @author libingc
 * @date 2020/11/25
 */
public class Demo {
    public static void main(System[] args){
      //[['1','1','1','1','0'],['1','1','0','1','0'],['1','1','0','0','0'],['0','0','0','0','0']]
        char[][] grid = new char[][]{{'1','1','1','1','0'},
                                     {'1','1','0','1','0'},
                                     {'1','1','0','0','0'},
                                     {'0','0','0','0','0'}};
         NumberOfIslands islands = new NumberOfIslands();
         int result = islands.numIslands(grid);
         System.out.println("岛屿数量:"+result);
    }
}
