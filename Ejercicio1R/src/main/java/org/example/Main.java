package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mete un numero");
        int num = scan.nextInt();
        System.out.println(num > 0 ? "El numero es positivo" : "El numero es negativo");
    }
}