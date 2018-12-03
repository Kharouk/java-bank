//package com.javabanktech;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.io.*;
//import java.util.NoSuchElementException;
//
//public class BankTest {
//    private Bank barclays;
//    private Person mockedPerson;
//
//    @BeforeEach
//    void setUp() {
//        barclays = new Bank();
//        mockedPerson = mock(Person.class);
//        when(mockedPerson.getBalance()).thenReturn(100.00);
//        when(mockedPerson.getName()).thenReturn("Steve");
//    }
//
//    @Test
//    void checksIfWorking() {
//        assertEquals("JavaBank is now Open!", barclays.greeting());
//    }
//
//    @Test
//    void OpeningUpABankAccount() {
//        assertEquals("Thanks for signing up with JavaBank, Steve. Your current total is $100.00",
//                barclays.newAccount(mockedPerson));
//    }
//
//    @Test
//    void WithdrawingMoneyFromAccount() {
//        barclays.newAccount(mockedPerson);
//        String input = "Steve";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        barclays.makeWithdrawal(50);
//
//        assertEquals(50, barclays.currentBalance());
//    }
//
//    @Test
//    @DisplayName("Trying to dupe the withdrawal system test:")
//    void TryingToDupeWithdrawalSystem() {
//        assertThrows(NoSuchElementException.class, () -> {
//            barclays.newAccount(mockedPerson);
//            String input = "Velma";
//            InputStream in = new ByteArrayInputStream(input.getBytes());
//            System.setIn(in);
//            barclays.makeWithdrawal(50);
//
//            assertEquals(100, barclays.currentBalance());
//        });
//    }
//
//    @Test
//    void WithdrawingMoneyUserDoesNotHave() {
//        barclays.newAccount(mockedPerson);
//        String input = "Steve";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        barclays.makeWithdrawal(101);
//        assertEquals(100, barclays.currentBalance());
//
//    }
//
//    @Test
//    void DepositingMyWeakEarningsIntoAccount() {
//        barclays.newAccount(mockedPerson);
//        assertEquals("Thanks for trusting us with your cash Steve, " +
//                "your new balance is $110.00", barclays.depositMoney(10));
//    }
//
//}