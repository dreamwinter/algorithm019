import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author libingc
 * @date 2020/11/26
 */
class NumberOfIslandsTest {

    @Test
    void numIslandsTest() {
        char[][] grid = new char[][]{{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        NumberOfIslands islands = new NumberOfIslands();
        int result = islands.numIslands(grid);
        assertEquals(result,1);
    }
}