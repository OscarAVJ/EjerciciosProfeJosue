package org.example;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>();
        users.add("Mariana");
        users.add("Gerardo");
        users.add("Freddy");
        users.add("Joshua");
        users.add("Edwin");
        users.add("Edwin");
        System.out.println("Usuarios " + users);
        System.out.println("Contiene " + users.contains("Mariana"));
    }
}