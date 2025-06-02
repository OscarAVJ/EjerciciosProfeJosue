package org.example;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> jugadores = new TreeMap<String, Integer>();
        jugadores.put("Messi", 100);
        jugadores.put("Cris", 200);
        jugadores.put("Neimar", 400);
        jugadores.put("Abel", 100);

        String nameMax="";
        int puntMax = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> jugador : jugadores.entrySet()){
            String jugadorActual = jugador.getKey();
            int puntoActual = jugador.getValue();
            if(puntoActual > puntMax){
                nameMax = jugadorActual;
                puntMax = puntoActual;
            }
        }
        System.out.println(jugadores);
        System.out.println("Max "+ nameMax + " "+ puntMax);
    }
}