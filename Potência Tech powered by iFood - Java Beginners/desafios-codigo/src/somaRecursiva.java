import java.util.*;

public class somaRecursiva {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.print(somatorio(numero));
        scan.close();
    }
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}