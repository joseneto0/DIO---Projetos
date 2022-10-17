package arrays;
import java.util.Random;

public class Ex03_NumeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }
        for (int i : numeros) {
            System.out.println("Sucessor de " + i + " = " + (i + 1));
            System.out.println("Antecessor de " + i + " = " + (i - 1));
        }
    }
}
