package com.kodilla.bank.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveNullLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getAccountBalance(0);
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldReturnNumberOfTransactionWhereLastIsDebt(){
//invalid transaction - trying withdraw money when not enough cash on ITM
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-100);
        cashMachine.add(20);
        cashMachine.add(-20);
        cashMachine.add(-60);
        assertEquals(5, cashMachine.getAccountBalance(5).length);
    }

    @Test
    public void shouldReturnTransactionBecauseThereIsNoMoneyOnAccount(){
//invalid transaction - trying withdraw money when not enough cash in the cash machine
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(-50);
        cashMachine.add(20);
        cashMachine.add(-20);
        cashMachine.add(-100);
        assertEquals(0, cashMachine.getAverageWithdrawMoney());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfEmpty(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(20);
        cashMachine.add(-20);
        cashMachine.add(-150);
        assertEquals(0, cashMachine.getAverage());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfNoTransactionsWereMade(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAccountBalance(0));
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfNoTransactionsWereMade(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0.0, cashMachine.getAverageDepositMoney() + cashMachine.getAverageWithdrawMoney(), 0.00);
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfEmpty(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-40);
        cashMachine.add(-50);
        cashMachine.add(-50);
        assertEquals(-140,cashMachine.getAverageWithdrawMoney());
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfNotEnoughMoney(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(-100);
        cashMachine.add(100);
        cashMachine.add(-200);
        cashMachine.add(100);
        cashMachine.add(-50);
        cashMachine.add(-20);
        assertEquals(4,cashMachine.getAverageWithdrawMoney());
    }

    @Test
    public void shouldReturnAverageDepositEqualsZeroIfNoDeposits(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0.0, cashMachine.getAverageDepositMoney(), 0.00);
    }

    @Test
    public void shouldReturnAverageWithdraws(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-50);
        cashMachine.add(-100);
        cashMachine.add(-200);
        cashMachine.add(-20);
        assertEquals(-370.0, cashMachine.getAverageWithdrawMoney(), -370.00);
    }
}