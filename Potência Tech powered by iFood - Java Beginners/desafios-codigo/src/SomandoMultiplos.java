import java.util.Scanner;
public class SomandoMultiplos {
    public static void main(String[] args){
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int soma = 0;
        for (int i = 1; i <= N; i++){
            if (A % i == 0 || i % A == 0){
                soma += i;
            }
        }
        System.out.print(soma-1);
    }
}
