package loops;
import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        int maior = 0;
        int soma = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite a " + i + "° nota: ");
            nota = scan.nextInt();
            if (nota > maior) maior = nota;
            soma += nota;
        }
        System.out.println("Sua média é: " + soma / 5);
        System.out.println("O maior número foi: " + maior);
        scan.close();
    }
}