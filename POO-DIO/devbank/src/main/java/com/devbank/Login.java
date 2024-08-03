package com.devbank;

import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Login {
    private String user;
    private String password;

    public void start(Scanner sc){
        System.out.println("Digite seu usuario: ");
        this.user = sc.nextLine();

        System.out.println("Digite sua senha: ");
        this.password = sc.nextLine();
    }
}
