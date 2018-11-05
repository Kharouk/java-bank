package com.javabanktech;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class BankTest {

    private Bank barclays;

    @BeforeEach
    void setUp() {
        barclays = new Bank();
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
    void inputMessageWithNoName() {
        String input = "n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Fair enough. Have a wonderful day!", barclays.sayingHello());
    }

    @Test
    void OpeningUpABankAccount() {
        Person mockedPerson = mock(Person.class);
        when(mockedPerson.getBalance()).thenReturn(100.00);
        when(mockedPerson.getName()).thenReturn("Steve");

        assertEquals("Thanks for signing up with JavaBank, Steve. Your current total is $100.00", barclays.newAccount(mockedPerson));
    }

}