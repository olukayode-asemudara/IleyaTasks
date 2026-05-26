import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestLevelTwo{
    
    @Test
    public void testThatMethodReturnsArrayThatHaveDuplicateValuesInGivenArray(){
        
        // Arrange
        int[] array = {1,2,3,2,4,3};
        int[] expectedResult = {2,3};
        
        // Act
        int[] actualResult = LevelTwo.getRepeatedValues(array);
        
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testThatMethodMovesPositionOfZerosToTheEndOfArray(){
        
        // Arrange
        int[] array = {5,0,3,0,2,0};
        int[] expectedResult = {5,3,2,0,0,0};
        
        // Act
        int[] actualResult = LevelTwo.swapZeroPositions(array);
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
}



// javac -cp "junit.jar:out" -d outTestFile.java CodeFile.java
// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
