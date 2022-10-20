package edu.exercicios.zezin;

public class Quadrilatero {
    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double base, double altura){
        return base * altura;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMenor + baseMaior) * altura) / 2;
    }

    public static float area(float diagonalMaior, float diagonalMenor){
        return (diagonalMenor * diagonalMaior) / 2;

    }
}
