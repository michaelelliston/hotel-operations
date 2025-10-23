import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
    void test_checkIn() {
        // Arrange
        Room objectUnderTest = new Room(2, 139, true, false, 1, "king");
        // Act
        boolean actual = objectUnderTest.checkIn();
        // Assert
        assertTrue(actual);
        assertFalse(objectUnderTest.clean);
        assertTrue(objectUnderTest.occupied);

    }

    @Test
    void test_checkOut() {

        Room objectUnderTest = new Room(2, 139, false, true, 1, "king");

        boolean actual = objectUnderTest.checkOut();

        assertTrue(actual);
        assertTrue(objectUnderTest.clean);
        assertFalse(objectUnderTest.occupied);
    }
}