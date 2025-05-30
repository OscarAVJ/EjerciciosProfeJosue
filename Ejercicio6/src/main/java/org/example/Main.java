package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Cuanto cuesta lo que queres comprar");
        int num = scan.nextInt();
        if(num > 0 && num <= 101){
            System.out.println("Gracias, se le aplicara un descuento de 10%");
            System.out.println("Total a pagar:");
            System.out.println("Precio Original "+ num);
            System.out.println("Total a pagar" + (num -(num*0.1)));
        } else if (num > 101 && num <= 2001) {
            System.out.println("Gracias, se le aplicara un descuento de 20%");
            System.out.println("Total a pagar:");
            System.out.println("Precio Original "+ num);
            System.out.println("Total a pagar" + (num -(num*0.2)));
        }else{
            System.out.println("No hay descuento para su prenda");
        }
    }
}