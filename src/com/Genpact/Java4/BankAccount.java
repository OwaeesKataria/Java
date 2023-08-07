package com.Genpact.Java4;

abstract public class BankAccount {
    abstract void deposit();
    abstract void withdraw();
}
class SavingAccounts extends BankAccount{

    @Override
    void deposit() {
        System.out.println("Deposit in Saving Account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Saving Acountt");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("Deposit in Current Account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}
