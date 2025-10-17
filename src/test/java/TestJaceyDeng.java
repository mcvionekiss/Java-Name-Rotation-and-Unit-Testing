import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestJaceyDeng {

    static JaceyDeng student;

    @BeforeAll
    static void setUp(){
        student = new JaceyDeng("Peter",
                "Anteater",
                "panteater",
                12345678);
    }

    @Test
    void testGetFullName() {
        assertEquals("Peter Anteater", student.getFullName());
    }

    @Test
    void testGetFirstName() {
        assertEquals("Peter", student.getFirstName());
    }

    @Test
    void TestGetLastName() {
        assertEquals("Anteater", student.getLastName());
    }

    @Test
    void TestGetUCInetID() {
        assertEquals("panteater", student.getUCInetID());
    }

    @Test
    void TestGetStudentNumber() {
        assertEquals(12345678, student.getStudentNumber());
    }

    @Test
    void TestPositiveGetRotatedFullName() {
        assertEquals("ter AnteaterPe", student.getRotatedFullName(2));
    }

    @Test
    void TestNegativeGetRotatedFullName() {
        assertEquals("eaterPeter Ant", student.getRotatedFullName(-5));
    }
}