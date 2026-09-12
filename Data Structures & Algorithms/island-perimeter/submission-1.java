class Solution 
{   
    public int islandPerimeter(int[][] grid) 
    {
       int row = grid.length;
       int col = grid[0].length;

       for(int i = 0; i <  row; i++)
       {
         for(int j = 0; j < col; j++)
         {
             if(grid[i][j] == 1)
               return dfs(grid, i , j, row, col);
         }
       }

       return 0;   
    }

    public int dfs(int[][] grid, int i , int j, int row, int col)
    {
        if( i < 0 || i >= row || j < 0 || j >= col )
          return 1;

        if(grid[i][j] == 0)
          return 1;

        if(grid[i][j] == -1)
          return 0;  

        grid[i][j] = -1;

        

        int perimeter = 0;

        perimeter += dfs(grid, i - 1, j, row, col);  //up
        perimeter += dfs(grid, i + 1, j, row, col);  //down
        perimeter += dfs(grid, i , j - 1, row, col);  //left
        perimeter += dfs(grid, i , j + 1, row, col);  //right 

        return perimeter; 
    }
}