package com.devbank.menu;

import com.devbank.Client;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Menu {

    public void show(){
        System.out.println("===== Bem vindo ao DEVBANK =====");
        System.out.println("1. Já sou cliente.");
        System.out.println("2. Quero ser cliente.");
        System.out.println("0. Sair");
    }

    public void welcomeMessage(Client client){
        System.out.println(String.format("Olá %s, o que gostaria de fazer: ", client.getName()));
    }

    public void showAccountOptions(){
        System.out.println("1. Sacar ");
        System.out.println("2. Depositar ");
        System.out.println("3. Transferir ");
        System.out.println("4. Extrato ");
        System.out.println("0. Sair da conta");
    }
}
