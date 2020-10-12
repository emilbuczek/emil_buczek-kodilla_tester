package com.kodilla.bank.homework;

public class CashMachine  {

    private static int transaction;
    private static int[] accountTransactions;

    public CashMachine() {
        this.transaction=0;
        this.accountTransactions = new int[0];
    }

    public void add(int money) {
        this.transaction++;
        int[] newTab = new int[this.transaction];
        System.arraycopy(accountTransactions, 0, newTab, 0, accountTransactions.length);
        newTab[this.transaction - 1] = transaction;
        this.accountTransactions = newTab;
    }
    public int[] getAccountBalance(int transaction) {
        return accountTransactions;
    }

    public double getAverage(){
        if(this.accountTransactions.length ==0){
            return 0;
        }
        double number = 0;
        for(int i=0;i<accountTransactions.length;i++){
            number +=accountTransactions[i];
        }
        return number/accountTransactions.length;
    }

    public static double getTransactionSum(){
        double number = 0;
        for(int i=0;i<accountTransactions.length;i++) {
            number += accountTransactions[i];
        }
        return number;
    }

    public static double depositMoney() {
        double number = 0;
        for (int i = 0; i < accountTransactions.length; i++) {
            if (accountTransactions[i] < 0) {
                number += accountTransactions[i];
            }
        }
        return number;
    }
    public static double withdrawMoney() {
        double number = 0;
        for (int i = 0; i < accountTransactions.length; i++) {
            if (accountTransactions[i] < 0) {
                number += accountTransactions[i];
            }
        }
        return number;
    }

    public double getAverageDepositMoney() {
        if (this.accountTransactions.length == 0) {
            return 0;
        }
        double number = 0;
        int clock = 0;
        for (int i = 0; i < accountTransactions.length; i++) {
            if (accountTransactions[i] > 0) {
                number += accountTransactions[i];
                clock++;
            }
        }
        return number/clock;
    }

    public double getAverageWithdrawMoney(){
        if(this.accountTransactions.length==0){
            return 0;
        }
        double number = 0;
        int clock = 0;
        for(int i=0;i<accountTransactions.length;i++){
            if(accountTransactions[i]<0){
                number +=accountTransactions[i];
                clock++;
            }
        }
        return number/clock;
    }










    ///   public int withdrawMoney(int transaction) {
//        return this.balance - transaction;
//    }
//
//    public int depositMoney(int transaction) {
//        return this.balance + transaction;
//    }
//
//    public double getAverage() {
//        if (this.accountTransactions.length == 0) {
//            return 0;
//    }


//    public double getTransactions() {
//        if (this.accountTransactions.length == 0) {
//            return 0;
//        }
//        double sum = 0;
//        for (int i = 0; i < this.accountTransactions; i++) {
//            sum += this.accountTransactions.[i];
//        }
//        return sum / this.accountTransactions.length;
//    }
}
