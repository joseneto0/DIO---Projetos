package arrays;
import java.util.Random;

public class Ex04_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
