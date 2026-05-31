import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCheckOutApp{    

    @Test
    public void testGetSubtotalInNormalCase() {
        // Arrange
        int[] quantities = {2, 3, 1};
        double[] prices = {1000.0, 500.5, 2000.0};
        
        // Act
        double result = CheckOutApp.getSubtotal(quantities, prices);
        
        // Assert
        assertEquals(5501.5, result, 0.001);
    }
    
    
    @Test
    public void testGetSubtotalWithOnlySingleItem() {
        // Arrange
        int[] quantities = {5};
        double[] prices = {9.99};
        
        // Act
        double result = CheckOutApp.getSubtotal(quantities, prices);
        
        // Assert
        assertEquals(49.95, result, 0.001);
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
    public void testThatMethodGetsVAT() {
        // Arrange
        double subtotal = 1000.0;
        double expectedResult = 75.0;
        
        // Act
        double actualResult = CheckOutApp.getVAT(subtotal);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
}



// javac -cp "junit.jar:out" -d out TestLevelOne.java LevelOne.java
// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
