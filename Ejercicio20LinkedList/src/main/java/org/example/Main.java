package org.example;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validator = true;
        LinkedList<String> cola = new LinkedList<>();
        do{
            System.out.println("Opciones");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Agregar cliente VIP");
            System.out.println("3. Atender cliente");
            System.out.println("4. Ver cola");
            System.out.println("5. Salir");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:
                    System.out.println("Nombre del cliente");
                    String nombre = scan.nextLine();
                    cola.add(nombre);
                    break;
                case 2:
                    System.out.println("Nombre del cliente VIP");
                    String nombreVIP = scan.nextLine();
                    cola.addFirst(nombreVIP);
                    System.out.println(cola.getFirst());
                    break;
                case 3:
                    System.out.println("Nombre del cliente");
                    String nombreAtendido = scan.nextLine();
                    if(cola.contains(nombreAtendido)){
                        cola.remove(nombreAtendido);
                    }else{
                        System.out.println("Ingresar un nombre valido");
                    }
                    break;
                case 4:
                    System.out.println(cola);
                    break;
                case 5:
                    System.out.println("Salir");
                    validator = false;
                    break;
            }
        }while(validator);
    }
}