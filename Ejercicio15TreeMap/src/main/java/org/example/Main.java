package org.example;

import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Double> productos = new TreeMap<>();
        productos.put("Alcohol", 100.00);
        productos.put("Manzana", 200.00);
        productos.put("Jabon", 200.00);
        System.out.println(productos);
        System.out.println(productos.get("Manzana"));
        String nombreBajo = "";
        double precioBajo= Double.MAX_VALUE;
        String nombreAlto = "";
        double precioAlto= Double.MIN_VALUE;
        for(Map.Entry<String, Double>entrada: productos.entrySet()){
            String nombre = entrada.getKey();
            double precioActual = entrada.getValue();
            if(precioActual < precioBajo){
                precioBajo = precioActual;
                nombreBajo = nombre;
            }
            if(precioActual > precioAlto){
                precioAlto = precioActual;
                nombreAlto = nombre;
            }
        }
        System.out.println("ALTO " + nombreAlto +" "+ precioAlto);
        System.out.println("BAJO " + nombreBajo +" "+ precioBajo);

    }
}