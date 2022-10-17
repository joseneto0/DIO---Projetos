package loops;
import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite uma nota: ");
            nota = scanner.nextInt();
            if (nota >= 0 && nota <= 10) break;
            System.out.println("Nota Inválida, digite novamente");
        }
        scanner.close();
    }
}