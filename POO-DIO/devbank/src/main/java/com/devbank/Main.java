package com.devbank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.devbank.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        LoginService loginService = new LoginService();
        BankService bankService = new BankService();
        Bank bank = new Bank();
        
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Client> clientes = new HashMap<>();
            Client clientFounded;
            
            boolean menuOptions = true;
            
            while (menuOptions) {
                menu.show();
                int userOption = sc.nextInt();
                sc.nextLine();
                
                switch (userOption) {
                    case 1 -> {
                        clientFounded = loginService.login(sc, clientes);
                        if (clientFounded != null) {
                            menu.welcomeMessage(clientFounded);
                            bankService.handleAccountOperations(sc, clientFounded, menu, bank);
                        }
                    }
                    case 2 -> {
                        Client newClient = Client.createClientFromInput(sc);
                        clientes.put(newClient.getUser(), newClient);
                        bank.addAccount(newClient.getAccount());
                        System.out.println("Deseja acessar sua conta agora? S/N");
                        String answer = sc.nextLine();
                        if ("S".equalsIgnoreCase(answer)) {
                            clientFounded = loginService.login(sc, clientes);
                            if (clientFounded != null) {
                                menu.welcomeMessage(clientFounded);
                                bankService.handleAccountOperations(sc, clientFounded, menu, bank);
                            }
                        }
                    }
                    case 0 -> {
                        System.out.println("Saindo...");
                        menuOptions = false;
                    }
                    default -> System.out.println("Opção inválida");
                }
            }
        }
    }
}