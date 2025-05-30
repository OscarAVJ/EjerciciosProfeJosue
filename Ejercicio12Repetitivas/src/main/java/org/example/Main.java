package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =0;
        do{
            System.out.println("Mete un numero");
            System.out.println("1. seguir");
            System.out.println("2. salir");
            num = scan.nextInt();
        }while(num != 2);
        System.out.println("Saliste ");

    }
}