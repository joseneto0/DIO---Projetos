package arrays;

public class Ex01_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Vetor: ");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.println("Posição " + i + " = " + vetor[i]);
        }
    }
}
