import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetDiscountTest {
    @org.junit.jupiter.api.Test
    public void testGetDiscount() {

    }

    @Test
    public void testGetDiscount_ReturnsZeroForAgeBelowTen() {
        // Arrange
        int age = 5;
        String isWarsaw = "Warsaw";
        boolean isThursday = false;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(1.0, discount);
    }

    public void testGetDiscount_ReturnsOneForThursday() {
        // Arrange
        int age = 20;
        String isWarsaw = "Krakow";
        boolean isThursday = true;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.1, discount);
    }

    public void testGetDiscount_ReturnsFiftyPercentForAgeBetweenTenAndEighteen() {
        // Arrange
        int age = 15;
        String isWarsaw = "Warsaw";
        boolean isThursday = false;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.6, discount);
    }

    public void testGetDiscount_ReturnsTenPercentExtraForWarsaw() {
        // Arrange
        int age = 15;
        String isWarsaw = "Warsaw";
        boolean isThursday = false;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.6, discount);
    }

    public void testGetDiscount_ReturnNothingifothercity() {
        // Arrange
        int age = 25;
        String isWarsaw = "Krakow";
        boolean isThursday = false;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.0, discount);
    }

    public void testGetDiscount_IfThursday() {
        // Arrange
        int age = 25;
        String isWarsaw = "Warsaw";
        boolean isThursday = true;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.2, discount);
    }

    public void testGetDiscount_IfThursdayAnd18() {
        // Arrange
        int age = 18;
        String isWarsaw = "Warsaw";
        boolean isThursday = true;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.7, discount);
    }
}
