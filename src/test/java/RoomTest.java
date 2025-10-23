import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test
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
}