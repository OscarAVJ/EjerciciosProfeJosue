package org.example;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean continueValidator = true;
        String pestania ="";
        LinkedList<String> navegacion = new LinkedList<>();
        do{
            System.out.println("Que quieres hacer?");
            System.out.println("1.Navegar a otra pesnaña");
            System.out.println("2.Cerrar pesnaña");
            System.out.println("3.Cerrar navegador");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:
                    System.out.println("Agrega la pesnta;a");
                    pestania = scan.nextLine();
                    navegacion.add(pestania);
                    System.out.println(navegacion);
                    break;
                case 2:
                    System.out.println("Selecciona la pesnta;a a cerrar");
                    pestania = scan.nextLine();
                    if (navegacion.contains(pestania)) {
                        navegacion.remove(pestania);
                    }else {
                        System.out.println("Seleccione una penstania valida");
                    }
                    System.out.println(navegacion);
                    break;
                case 3:
                    continueValidator = false;
                    System.out.println(navegacion);
                    break;
            }

        }while (continueValidator);
    }
}