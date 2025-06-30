package com.example.banktest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000);
        System.out.println("Setup: Account created with balance 1000");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown: Test completed\n");
    }

    @Test
    public void testDeposit() {
        int depositAmount = 500;
        account.deposit(depositAmount);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        int withdrawAmount = 300;
        account.withdraw(withdrawAmount);
        assertEquals(700, account.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverdraw() {
        int overdrawAmount = 2000;
        account.withdraw(overdrawAmount);
    }
}
