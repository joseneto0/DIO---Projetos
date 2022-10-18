package edu.exercicios.zezin;

public class Mensagem {
    public static void obterMensagem(int hora){
        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomDia();
            case 13, 14, 15, 16, 17, 18 -> mensagemBoaTarde();
            case 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> mensagemBoaNoite();
            default -> System.out.println("Hora Inválida");
        }
    }
    public static void mensagemBomDia(){
        System.out.println("Bom Dia Flor do Dia! :D");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Bom Tarde Lírio das Fazes :O");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite Doce de Abacate :D");
    }
}
