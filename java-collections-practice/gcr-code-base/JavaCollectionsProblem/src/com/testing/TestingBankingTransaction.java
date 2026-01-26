package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingBankingTransaction {

    private BankingTransaction account;

    @BeforeEach
    void setUp() {
        account = new BankingTransaction(2000.0);
    }

    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(2500.0, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        boolean result = account.withdraw(300.0);

        assertTrue(result);
        assertEquals(1700.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        boolean result = account.withdraw(2500.0);

        assertFalse(result);
        assertEquals(2000.0, account.getBalance());
    }
}
