package com.devbank;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {

    private String name;

    private List<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public Account findAccount(int agency, String accountNumber) {
        for (Account account : accounts) {
            if (account.getAgency() == agency && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
