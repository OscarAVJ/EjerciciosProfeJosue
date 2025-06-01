package org.example;

import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> participants = new HashSet<>();
        boolean validator = true;
        String nombre;

        while(validator){
            System.out.println("Ingresa el nombre del participante");
            nombre = scan.nextLine();
            if(participants.contains(nombre)){
                System.out.println("El participante ya fue ingresado");
            }
            participants.add(nombre);
            System.out.println("Desea seguir ingresando participantes?");
            System.out.println("1. Seguir");
            System.out.println("2. Parar");
            int continueAdd = scan.nextInt();
            scan.nextLine();
            validator = continueAdd == 1;
        }
        System.out.println(participants);
    }

}