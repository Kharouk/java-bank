package com.javabanktech;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
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
        assertEquals("That's a great new name Alex, enjoy your time at the JavaBank!", barclays.sayingHello());
    }

    @Test
    void OpeningUpABankAccount() {
        Person mockedPerson = mock(Person.class);
        when(mockedPerson.getBalance()).thenReturn(100.00);
        when(mockedPerson.getName()).thenReturn("Steve");

        assertEquals("Thanks for signing up with JavaBank, Steve. Your current total is $100.00", barclays.newAccount(mockedPerson));
    }

}