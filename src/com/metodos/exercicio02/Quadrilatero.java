package com.metodos.exercicio02;

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Área quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Área retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área retângulo: " + ((baseMaior + baseMenor) * altura) / 2);
    }
}
