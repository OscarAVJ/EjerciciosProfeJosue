package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scan.nextInt();
        System.out.println(num % 2 == 0 ? "Numero par": "Numero impar");
    }
}