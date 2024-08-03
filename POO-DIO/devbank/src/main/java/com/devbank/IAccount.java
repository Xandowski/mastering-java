package com.devbank;

import java.util.Scanner;

public interface IAccount {
    void withdraw(Scanner sc);
    void deposit(double value);
    void deposit(Scanner sc);
    void transfer(Scanner sc, Bank bank);
    void printStatement();
}
