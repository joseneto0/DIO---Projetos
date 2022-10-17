package loops;
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int numeros;
        int N;
        System.out.println("Digite quantos números você quer digitar: ");
        N = scan.nextInt();
        for (int i = 1; i <= N; i++){
            System.out.println("Digite o " + i + "° número: ");
            numeros = scan.nextInt();
            if (numeros % 2 == 0) pares++; else impares++;
        }
        scan.close();
        System.out.println("Você obteve " + pares + " números pares e " + impares + " números impares");
    }
}
