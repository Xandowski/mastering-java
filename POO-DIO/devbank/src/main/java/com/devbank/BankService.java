package com.devbank;

import java.util.Scanner;

import com.devbank.menu.Menu;

public class BankService {
    public void handleAccountOperations(Scanner sc, Client client, Menu menu, Bank bank) {
        Account clientAccount = client.getAccount();
        boolean toContinue = true;

        while (toContinue) {
            menu.showAccountOptions();
            int accountOptions = sc.nextInt();
            sc.nextLine();

            switch (accountOptions) {
                case 1 -> clientAccount.withdraw(sc);
                case 2 -> clientAccount.deposit(sc);
                case 3 -> clientAccount.transfer(sc, bank);
                case 4 -> clientAccount.printStatement();
                case 0 -> toContinue = false;
                default -> System.out.println("Opção inválida");
            }

            if (toContinue) {
                System.out.println("Deseja realizar outra operação? S/N");
                String answer = sc.nextLine();
                if ("N".equalsIgnoreCase(answer)) {
                    toContinue = false;
                }
            }
        }
    }
}