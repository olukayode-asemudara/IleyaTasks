import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBookSuggestion{
    
    @Test
    public void testThatMethodGeneratesRandomBook(){
        
        // Arrange
        String[] books = {"The Hobbit", "The Mystery", "Animal farm", "Brave Kingdom"};
        String expectedResult = "The Hobbit";
        
        // Act
        String actualResult = BookSuggestionSystem.generateRandomBook(books);
        
        // Assert
        assertEquals(expectedResult, actualResult);
        
    }
}



// javac -cp "junit.jar:out" -d out TestBookSuggestion.java BookSuggestionSystem.java
// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
