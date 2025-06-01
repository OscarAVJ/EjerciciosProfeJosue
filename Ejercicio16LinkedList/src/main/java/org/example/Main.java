package org.example;

import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Double> ciudades = new TreeMap<>();
        ciudades.put("San Salvador", 1000.00);
        ciudades.put("Madrid", 32.00);
        ciudades.put("Barcelona", 23.00);
        ciudades.put("San Miguel", 10.00);

        System.out.println(ciudades);
        String ciudadActual="";
        double tempAlta = Double.MAX_VALUE;
        String ciudadActual2="";
        double tempBaja = Double.MIN_VALUE;
        for (Map.Entry<String, Double> ciudad : ciudades.entrySet()){
            String nombre= ciudad.getKey();
            double temperatura = ciudad.getValue();
            if(temperatura > tempBaja){
                tempBaja = temperatura;
                ciudadActual2 = nombre;
            }
            if(temperatura < tempAlta){
                tempAlta = temperatura;
                ciudadActual = nombre;
            }
        }
        System.out.println("Alta "+  ciudadActual2+ " "+ tempBaja);
        System.out.println("Baja "+ ciudadActual + " "+ tempAlta);

    }
}