import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
class MainTest {
    @org.junit.jupiter.api.Test
    public void testMain() {
        // Arrange
        double ticket_price = 40;
        Scanner sc = new Scanner(System.in);
        int age = 18;
        String isWarsaw = "Warsaw";
        boolean isThursday = false;

        // Act
        double discount = Main.Getdiscount(age, isWarsaw, isThursday);

        // Assert
        assertEquals(0.6, discount);
    }

    // Add more tests for other scenarios as needed
}