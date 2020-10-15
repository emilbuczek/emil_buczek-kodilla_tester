package com.kodilla.bank.homework;

public class Bank {

    private CashMachine poznanska;
    private CashMachine warszawska;
    private CashMachine poniatowskiego;
    private CashMachine dmowskiego;
    private CashMachine kochanowskiego;

    public Bank() {
    this.poznanska = new CashMachine();
    this.warszawska = new CashMachine();
    this.poniatowskiego = new CashMachine();
    this.dmowskiego = new CashMachine();
    this.kochanowskiego = new CashMachine();
    }

    public void addMoneyToPoznanska(int i, int money){
        this.poznanska.getAccountBalance(money);
    }
    public void addMoneyToWarszawska(int i, int money){
        this.warszawska.getAccountBalance(money);
    }
    public void addMoneyToPoniatowskiego(int i, int money){
        this.poniatowskiego.getAccountBalance(money);
    }
    public void addMoneyToDmowskiego(int i, int money){
        this.dmowskiego.getAccountBalance(money);
    }
    public void addMoneyToKochanowskiego(int i, int money){
        this.kochanowskiego.getAccountBalance(money);
    }

    public double getAveragePoznanska(){
        return this.poznanska.getAverage();
    }
    public double getAverageWarszawska(){
        return this.warszawska.getAverage();
    }
    public double getAveragePoniatowskiego(){
        return this.poniatowskiego.getAverage();
    }
    public double getAverageDmowskiego(){
        return this.dmowskiego.getAverage();
    }
    public double getAverageKochanowskiego(){
        return this.kochanowskiego.getAverage();
    }

    public double getTransactionSumPoznanska(){
        return this.poznanska.getTransactionSum();
    }
    public double getTransactionSumWarszawska(){
        return this.warszawska.getTransactionSum();
    }
    public double getTransactionSumPoniatowskiego(){
        return this.poniatowskiego.getTransactionSum();
    }
    public double getTransactionSumDmowskiego(){
        return this.dmowskiego.getTransactionSum();
    }
    public double getTransactionSumKochanowskiego(){
        return this.kochanowskiego.getTransactionSum();
    }

    public double depositMoneyPoznanska(){
       return this.poznanska.depositMoney();
    }
    public double depositMoneyWarszawska(){
        return this.warszawska.depositMoney();
    }
    public double depositMoneyPoniatowskiego(){
        return this.poniatowskiego.depositMoney();
    }
    public double depositMoneyDmowskiego(){
        return this.dmowskiego.depositMoney();
    }
    public double depositMoneyKochanowskiego(){
        return this.kochanowskiego.depositMoney();
    }

    public double withdrawMoneyPoznanska(){
        return this.poznanska.withdrawMoney();
    }
    public double withdrawMoneyWarszawska(){
        return this.warszawska.withdrawMoney();
    }
    public double withdrawMoneyPoniatowskiego(){
        return this.poniatowskiego.withdrawMoney();
    }
    public double withdrawMoneyDmowskiego(){
        return this.dmowskiego.withdrawMoney();
    }
    public double withdrawMoneyKochanowskiego(){
        return this.kochanowskiego.withdrawMoney();
    }

    public double getAverageDepositMoneyPoznanska() {
        return this.poznanska.getAverageDepositMoney();
    }
    public double getAverageDepositMoneyWarszawska() {
        return this.warszawska.getAverageDepositMoney();
    }
    public double getAverageDepositMoneyPoniatowskiego() {
        return this.poniatowskiego.getAverageDepositMoney();
    }
    public double getAverageDepositMoneyDmowskiego() {
        return this.dmowskiego.getAverageDepositMoney();
    }
    public double getAverageDepositMoneyKochanowskiego() {
        return this.kochanowskiego.getAverageDepositMoney();
    }
    public double getAverageWithdrawMoneyPoznanska() {
        return this.poznanska.getAverageWithdrawMoney();
    }
    public double getAverageWithdrawMoneyWarszawska() {
        return this.warszawska.getAverageWithdrawMoney();
    }
    public double getAverageWithdrawMoneyPoniatowskiego() {
        return this.poniatowskiego.getAverageWithdrawMoney();
    }
    public double getAverageWithdrawMoneyDmowskiego() {
        return this.dmowskiego.getAverageWithdrawMoney();
    }
    public double getAverageWithdrawMoneyKochanowskiego() {
        return this.kochanowskiego.getAverageWithdrawMoney();
    }

    public double sumOfAllCashMachines() {
        double sum = getTransactionSumPoznanska() + getTransactionSumWarszawska() + getTransactionSumPoniatowskiego() + getTransactionSumDmowskiego() + getTransactionSumKochanowskiego();
        return sum/5;
    }
}
