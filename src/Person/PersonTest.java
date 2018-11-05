package Person;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Person Class")
class PersonTest {

    @Test
    @DisplayName("Getting back a Person's name")
    void PersonsName() {
        Person alex = new Person("Alex", 23, 100.00);
        assertEquals("Alex", alex.getName());
    }

    @Test
    @DisplayName("Getting back a Person's age")
    void PersonsAge() {
        Person alex = new Person("Alex", 23, 100.00);
        assertEquals(23, alex.getAge());
    }

    @Test
    @DisplayName("Getting back a Person's balance")
    void PersonsBalance() {
        Person alex = new Person("Alex", 23, 100.00);
        assertEquals(100.00, alex.getBalance());
    }

}