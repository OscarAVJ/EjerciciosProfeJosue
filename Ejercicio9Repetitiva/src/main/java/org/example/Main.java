package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("De que numero queres la tabla");
        int num = scan.nextInt();
        for(int numMulti = 1; numMulti <=10; numMulti++){
            System.out.println(num*numMulti);
        }

    }
}