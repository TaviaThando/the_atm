package io.octavia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getAccNumber() {
        Bank bank = new Bank("0987654321");

        assertEquals("0987654321", bank.getAccNumber());
    }

    @Test
    void validAccNumber() {
        Bank bank = new Bank("0987654321");
        assertTrue(bank.validateAccNumber());
    }

    @Test
    void notValidAccNumber() {
        Bank bank = new Bank("0987654321");
        assertFalse(bank.validateAccNumber());
    }

    @Test
    void validPin() {
        Bank bank = new Bank("1234");
        assertTrue(bank.validatePin());
    }

    @Test
    void notValidPin(){
        Bank bank = new Bank("1234");
        assertFalse(bank.validatePin());
    }
}