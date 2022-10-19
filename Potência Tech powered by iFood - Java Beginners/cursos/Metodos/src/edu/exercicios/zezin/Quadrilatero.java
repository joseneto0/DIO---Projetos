package edu.exercicios.zezin;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do Quadrado: " + (lado * lado));
    }

    public static void area(double base, double altura){
        System.out.println("Área do Retângulo: " + (base * altura));
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do Retângulo: " + (((baseMaior + baseMenor) * altura )/ 2));
    }

    public static void area(float diagonalMaior, float diagonalMenor){
        System.out.println("Área do Losango: " + (diagonalMenor * diagonalMaior) / 2);

    }
}
