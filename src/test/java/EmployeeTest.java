import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void test_punchTimeCard() {
        Employee objectUnderTest = new Employee(11, "Michael", "Help Desk", 15.50, 34);

        String actual = objectUnderTest.punchTimeCard(LocalTime.now(), true);

        String expected = "Punched in";

        assertEquals(expected, actual);

        actual = objectUnderTest.punchTimeCard(LocalTime.now(), false);

        expected = "Punched out";

        assertEquals(expected, actual);
    }
}