package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pone un numero");
        int num = scan.nextInt();
        int suma = 0;
        while(num != 0){
            suma += num;
            num--;
            System.out.println(suma);
        }
    }
}