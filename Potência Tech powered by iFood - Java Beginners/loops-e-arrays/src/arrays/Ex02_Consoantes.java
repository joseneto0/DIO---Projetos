package arrays;
import java.util.Scanner;

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] vetor = new String[6];
        String letra;
        int qtdConsoantes = 0;
        for (int i = 0; i < 6; i++){
            System.out.println("Letra: ");
            letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))){ 
                vetor[i] = letra; 
                qtdConsoantes++;
            }
        }
        System.out.println("Quantidade de Consoantes: " + qtdConsoantes);
        System.out.println("Consoantes: ");
        for (String consoante: vetor){
            if (consoante != null) 
                System.out.println(consoante + " ");
        }
    }
}