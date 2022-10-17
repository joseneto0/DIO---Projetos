package loops;
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 1;
        System.out.println("Fatorial: ");
        numero = scan.nextInt();
        for (int i = numero; i > 0; i--){
            fatorial *= i;
        }
        scan.close();
        System.out.println(numero + "! = " + fatorial);
    }
}
