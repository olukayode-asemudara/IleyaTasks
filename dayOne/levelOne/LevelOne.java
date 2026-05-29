import java.util.ArrayList;
import java.util.Arrays;
public class LevelOne{

     public static int[][] getTwoDimensionalArray(int[] array) {
     
         int[][] grid = new int[2][3];
     
         int index = 0;
     
         for(int row = 0; row < grid.length; row++) {
     
             for(int column = 0; column < grid[row].length; column++) {
     
                 grid[row][column] = array[index];
     
                 index++;
             }
         }
         
         for(int row = 0; row < grid.length; row++){
             for(int col = 0; col < grid[row].length; col++){
                 System.out.print(grid[row][col] + " ");
             }
             System.out.println();
         }
     
         return grid;
     }
     
     
     public static boolean getPalindromeArray(int[] array){
         
         boolean isPalindrome = false;
         
         int[] reversedArray = new int[array.length];
         int reversedIndex = 0;
         
         for(int index = array.length -1; index >= 0 ; index--){
             reversedArray[reversedIndex] = array[index];
             reversedIndex++;
         }
             
        // for(int index = 0; index < reversedArray.length; index++){
                 
        //     System.out.print(reversedArray[index]);
        // }
         
         // if(reversedArray == array){
         //     isPalindrome = true;
         // } else{
         //     isPalindrome = false;
         // }
         
         // deitel page 350, ending paragraph
         isPalindrome = Arrays.equals(reversedArray, array);
         
         return isPalindrome;
     }
    
    
    public static int[] getArrayPerfectSquares(int[] array){
        
        int[] perfectSquares = new int[3];
        
        for(int index = 0; index < array.length; index++){
            if(array[index] % 2 == 0 && array[index] % 3 == 0){
                continue;
            } else{
                break;
            }
        }
        

        return new int[]{4,9,16};
    };
    
    
    public static int[] getNonePerfectSquares(int[] array){
    
        return new int[]{4,-1,9,-1,49,-1};
    }
    
    
    public static void main(String[] args){
        int[] array = {1,2,3,0};
        System.out.println(getPalindromeArray(array));
    }
    
}
