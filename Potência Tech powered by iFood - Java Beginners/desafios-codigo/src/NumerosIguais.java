import java.util.*;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A;
        int B;
        A = scan.nextInt();
        B = scan.nextInt();
        if (A == B){
          System.out.print("Sao iguais!");
        } else {
          System.out.print("Nao sao iguais!");
        }

    }
}