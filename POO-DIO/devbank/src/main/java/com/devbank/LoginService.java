package com.devbank;

import java.util.Map;
import java.util.Scanner;

public class LoginService {
    public Client login(Scanner sc, Map<String, Client> clientes) {
        Login login = new Login();
        int attempts = 3;

        while (attempts > 0) {
            login.start(sc);
            Client client = clientes.get(login.getUser());

            if (client != null && client.getPassword().equals(login.getPassword())) {
                return client;
            } else {
                --attempts;
                System.out.println(String.format("Usuário ou senha inválidos. Mais %d tentativas.", attempts));
            }
        }
        return null;
    }
}