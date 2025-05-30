package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        int num1, num2;
        System.out.println("Mete un numero");
        num1 = sacn.nextInt();
        System.out.println("Mete otro numero");
        num2 = sacn.nextInt();
        System.out.println("Que queres hacer");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4. Division");
        int num = sacn.nextInt();
        switch (num){
            case 1:
                System.out.println(Suma(num1, num2));
                break;
            case 2:
                System.out.println(Resta(num1, num2));
                break;
            case 3:
                System.out.println(Multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(Divicion(num1, num2));
                break;
            default:
                System.out.println("No valido");
                break;
        }

    }
    public static int Suma(int num1, int num2){
        return   num1 +num2;
    }
    public static int Resta(int num1, int num2){
        return   num1 - num2;
    }
    public static int Multiplicacion(int num1, int num2){
        return   num1 * num2;
    }
    public static int Divicion(int num1, int num2){
        return   num1 /num2;
    }
}