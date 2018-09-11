package employee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {
    Employee employee = new Employee("David", 23, 36, 41);

    @Test
    void getName() {
        String expected = "David";
        assertEquals(expected, employee.getName());
    }

    @Test
    void getRate() {
        float expected = 23;
        assertEquals(expected, employee.getRate());
    }

    @Test
    void getHours() {
        float expected = 36;
        assertEquals(expected, employee.getHours());
    }

    @Test
    void salaryPositive() {
        float expected = 23 * 36;
        assertEquals(expected, employee.salary());
    }

    @Test
    void salaryNegative() {
        float expected = 0;
        assertNotEquals(expected, employee.salary());
    }

    @Test
    void getAge() {
        int expected = 41;
        assertEquals(expected, employee.getAge());
    }
}