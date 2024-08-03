package com.devbank;

import java.util.Scanner;

import com.devbank.util.AccountNumberGenerator;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount {

    private static final int AGENCIA_PADRAO = 1;
    private static final AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();

    protected int agency;
    protected String accountNumber;
    protected double saldo;

    public Account() {
        this.agency = Account.AGENCIA_PADRAO;
        this.accountNumber = accountNumberGenerator.generateAccountNumber();
    }

    @Override
    public void withdraw(Scanner sc) {
        System.out.println("Digite o valor do saque: ");
        double withdrawValue = sc.nextDouble();
        sc.nextLine(); // Consumir a nova linha

        if (checkBalance(withdrawValue)) {
            this.saldo -= withdrawValue;
            System.out.println("Saque efetuado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void deposit(Scanner sc) {
        System.out.println("Digite o valor do deposito: ");
        double depositValue = sc.nextDouble();
        sc.nextLine(); // Consumir a nova linha

        deposit(depositValue);
    }

    @Override
    public void deposit(double value) {
        this.saldo += value;
        System.out.println("Depósito efetuado com sucesso.");
    }

    @Override
    public void transfer(Scanner sc, Bank bank) {
        System.out.println("Digite o valor da transferencia: ");
        double transferValue = sc.nextDouble();
        sc.nextLine(); // Consumir a nova linha

        if (checkBalance(transferValue)) {
            System.out.println("Digite a agencia: ");
            int destinationAgency = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            System.out.println("Digite o numero da conta: ");
            String inputAccountNumber = sc.nextLine();

            Account destinationAccount = bank.findAccount(destinationAgency, inputAccountNumber);
            if (destinationAccount != null) {
                this.saldo -= transferValue;
                destinationAccount.deposit(transferValue);
                System.out.println("Transferência efetuada com sucesso.");
            } else {
                System.out.println("Conta destino não encontrada.");
            }
        } else {
            System.out.println("Saldo insuficiente para realizar a transferencia.");
        }
    }

    @Override
    public void printStatement() {
        System.out.println("===== Extrato da conta =====");
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %s", this.accountNumber));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    private boolean checkBalance(double value) {
        return this.saldo >= value;
    }
}