package edu.exercicios.zezin;


import static edu.exercicios.zezin.Calculator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora: ");
        System.out.println(soma(10, 5));
        System.out.println(subtracao(10, 5));
        System.out.println(multiplicacao(10, 5));
        System.out.println(divisao(10, 5));

        System.out.println("Mensagem: ");
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(26);

        System.out.println("Empréstimo: ");
        Emprestimo.calcular(100, 3);
        Emprestimo.calcular(500, 2);

        System.out.println("Sobrecarga: ");
        System.out.println("Área do Quadrado: " + Quadrilatero.area(10.0));
        System.out.println("Área do Retângulo: " + Quadrilatero.area(10.0, 5.0));
        System.out.println("Área do Trapézio: " + Quadrilatero.area(6.0, 4.0, 3.0));
        System.out.println("Área do Losango: " + Quadrilatero.area(6f, 7f));
    }
}
