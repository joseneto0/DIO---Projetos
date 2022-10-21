package edu.exercicios.zezin;

public class Main {
    public static void main(String[] args) {
        Filha1 filha1 = new Filha1();
        Filha2 filha2 = new Filha2();
        Mae mae = new Mae();
        Mae[] arrayClasses = new Mae[]{filha1, filha2, mae};
        for (Mae i : arrayClasses){
            i.teste1();
            i.teste2();
        }
    }
}