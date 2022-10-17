import java.util.*;

public class buscaSequencial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int numero = scan.nextInt();
        boolean resultado = false;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == numero){
                System.out.println("Achei " + numero + " na posicao " + i);
                resultado = true;
                break;
            }
        }
        if (resultado == false){
            System.out.println("Numero " + numero + " nao encontrado!");
        }
        scan.close();

    }
}
