package com.devbank;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Client {

    private String name;
    private String cpf;
    private Account account;
    private String user;
    private String password;

    public Client(String name, String cpf, String user, String password) {
        this.name = name;
        this.cpf = cpf;
        this.user = user;
        this.password = password;
        this.account = new CheckingAccount();
    }

    public static Client createClientFromInput(Scanner sc) {
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite um usuario para login: ");
        String user = sc.nextLine();

        System.out.println("Crie uma senha: ");
        String password = sc.nextLine();

        return new Client(name, cpf, user, password);
    }
}
