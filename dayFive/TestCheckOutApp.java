import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCheckOutApp{

    @Test
    public void testThatMethodGetsUserInformation(){
        // Arrange
        String expectedResult = "Olukayode";
        
        
        // Act
        String actualResult = CheckOutApp.getCustomerInfo();
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testThatMethodGetsCashierInformation(){
        // Arrange
        String expectedResult = "Adetola";
        
        
        // Act
        String actualResult = CheckOutApp.getCashierInfo();
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testThatMethodCalculatesDiscount(){
        
        // Arrange
        double subTotal = 3000;
        double percentage = 0.5;
        double expectedResult = 15.0;
        
        // Act
        double actualResult = CheckOutApp.getDiscount(subTotal, percentage);
        
        // Arrange
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testThatMethodCalculatesVATValue(){
        
        // Arrange
        
        
        // Act
        
        
        // Assert
    }
}



// javac -cp "junit.jar:out" -d out TestLevelOne.java LevelOne.java
// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
