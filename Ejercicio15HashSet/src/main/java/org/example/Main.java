package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> wordsmiths = new ArrayList<>();
        wordsmiths.add("java");
        wordsmiths.add("hola");
        wordsmiths.add("java");
        wordsmiths.add("maven");
        wordsmiths.add("josue");
        HashSet<String> validator = new HashSet<>(wordsmiths);
        System.out.println(validator.toString().toUpperCase());
    }
}