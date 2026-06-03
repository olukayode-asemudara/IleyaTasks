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
    
    @Test
    public void testThatICanAddANewBookToTheBooksArray(){
        
        // Arrange
        
        
        // Act
        
        
        // Assert
    }
    
    
    @Test
    public void testThatThereAreNoDuplicateEntryBooksInTheArray(){
        
        // Arrange
        
        
        // Act
        
        
        // Assert
    }
}
