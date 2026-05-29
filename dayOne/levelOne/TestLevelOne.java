import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLevelOne{
    
    @Test
    public void testThatMethodBreaksOneArrayIntoTwoDimensionalArray(){
        // Arrange
        int[] array = {45,60,3,10,9,22};
        
        int[][] expectedResult = {
            {60,10,22},
            {45,3,9}
        };
        
        // Act
        int[][] actualResult = LevelOne.getTwoDimensionalArray(array);
        
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testWhetherArrayIsPalindromeOrNot(){
        
        // Arrange
        int[] array = {1,2,3,2,1};
        boolean expectedResult = true;

        // Act
        boolean actualResult = LevelOne.getPalindromeArray(array);

        // Assert
        assertTrue(actualResult);
    }
    
    @Test
    public void testThatArrayReturnsOnlyPerfectSquaresInTheGivenArray(){
        
        // Arrange
        int[] array = {4,7,9,10,16};
        int[] expectedResult = {4,9,16};
        
        // Act
        int[] actualResult = LevelOne.getArrayPerfectSquares(array);
        
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testThatMethodReturnsNonPerfectSquaredNumbers(){
        
        // Arrange
        int[] array = {4,7,9,10,49,6};
        int[] expectedResult = {4,-1,9,-1,49,-1};
        
        // Act
        int[] actualResult = LevelOne.getNonePerfectSquares(array);
        
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
}




// javac -cp "junit.jar:out" -d out TestLevelOne.java LevelOne.java
// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
