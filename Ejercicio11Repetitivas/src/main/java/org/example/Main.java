package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contra = "12345";
        String ingresada="";
        do{
            System.out.println("Mete la contra bro");
            ingresada = scan.nextLine();

        }while(!Objects.equals(ingresada, contra));
        System.out.println("LO LOGRASTE SALISTE DEL BUCLE");
    }
}