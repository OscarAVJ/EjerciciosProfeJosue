package org.example;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Añade 3 canciones al final.
//        Agrega una canción como "reproducción siguiente" (al inicio).
//        Elimina la última canción.
//        Imprime la playlist en orden.
        LinkedList<String> canciones = new LinkedList<>();
        canciones.add("1");
        canciones.add("2");
        canciones.add("3");
        canciones.add("4");
        canciones.add("5");
        canciones.add("6");
        canciones.add("7");
        canciones.add("8");
        canciones.add("9");
        canciones.add("10");
        System.out.println(canciones);
//        Otras 3 canciones'
        canciones.addLast("11");
        canciones.addLast("12");
        canciones.addLast("13");
        System.out.println(canciones);
//        Agregar al inicio
        canciones.addFirst("14");
        System.out.println(canciones);

        canciones.remove("1");
        System.out.println(canciones);




    }
}