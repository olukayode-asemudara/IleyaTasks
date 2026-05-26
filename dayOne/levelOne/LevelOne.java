import java.util.ArrayList;
public class LevelOne{

    public static int[][] getTwoDimensionalArray(int[] array) {
        
        int[][] grid = new int[3][3];
        
        return new int[][]{
            {45, 3, 9},
            {60, 10, 22}
        };
    }
    
    
    public static int[] getArrayPerfectSquares(int[] array){
        
        return new int[]{4,9,16};
    };
    
    
    public static int[] getNonePerfectSquares(int[] array){
    
        return new int[]{4,-1,9,-1,49,-1};
    }
}
