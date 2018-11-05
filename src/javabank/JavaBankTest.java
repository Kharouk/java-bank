package javabank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JavaBankTest {

    @Test
    void checksIfWorking() {
        JavaBank javabank = new JavaBank();
        assertEquals("JavaBank is now Open!", javabank.greeting());
    }
}