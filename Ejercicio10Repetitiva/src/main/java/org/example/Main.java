package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int counter=0;
        do{
            System.out.println("Mete un numero");
            num = scan.nextInt();
            counter++;

        }while(num != 0);
        System.out.println(counter-1);
    }
}