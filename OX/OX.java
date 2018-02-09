
/**
 * Write a description of class OX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OX
{
    private int grid[][] = new int[2][2];
    public void print(){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    System.out.println("_");
                }
                else if(grid[i][j] == 1){
                    System.out.println("O");
                }
                else if(grid[i][j] == 2){
                    System.out.println("X");
                }
            }
        }
    }
    public void wincheck(){
        int c = 0;
        int i = 0;
        for(i = 0; i < 3; i++){
            if(grid[i][c] == grid[i][c+1] && grid[i][c+2] == grid[i][c+1]){
                System.out.println("Hah");
            }
            else if(grid[c][i] == grid[c+1][i] && grid[c+2][i]){
                win
            }
        }
        if(grid[i][c] == grid[i+1][c+1] && grid[i+1][c+1] == grid[i+2][c+2]){
            
        }
        
        
        
        if(grid[0][0] ==  1 && grid[0][1] == 1 && grid[0][2] == 1)
            return x;
        else if(grid[1][0] && grid[0][0] && grid    
        
    }
    public void reset(){
         for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = 0;
            }
        }
    }
}
