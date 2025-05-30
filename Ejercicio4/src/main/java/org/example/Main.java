package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nota!");
        int nota = scan.nextInt();
        System.out.println(nota > 6 ? "Aprobaste" : "Malo Reprobaste");
    }
}