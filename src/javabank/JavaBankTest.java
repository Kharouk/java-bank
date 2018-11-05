package javabank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class JavaBankTest {

    @BeforeEach
    void initBank() throws Exception {
        System.out.println("Hello");
    }

    @Test
    void checksIfWorking() {
        JavaBank barclays = new JavaBank();
        assertEquals("JavaBank is now Open!", barclays.greeting());
    }

    @Test
    void inputMessage() {
        JavaBank barclays = new JavaBank();
        String input = "Alex";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Nice to see you Alex, welcome to JavaBank!", barclays.sayingHello());
    }

    @Test
    void checkBalanceOnAccount() {

    }
}