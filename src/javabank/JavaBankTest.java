package javabank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class JavaBankTest {

    private JavaBank barclays;

    @BeforeEach
    void setUp() {
        barclays = new JavaBank();
    }

    @Test
    void checksIfWorking() {
        assertEquals("JavaBank is now Open!", barclays.greeting());
    }

    @Test
    void inputMessage() {
        String input = "Alex";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Nice to see you Alex, welcome to JavaBank!", barclays.sayingHello());
    }

    @Test
    void createANewBankAccount() {
    }
}