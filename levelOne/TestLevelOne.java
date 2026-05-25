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
    
}





// javac -cp "junit.jar:out" -d outTestFile.java CodeFile.java
// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
