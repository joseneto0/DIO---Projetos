import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.print("FizzBuzz");
        } else if (numero % 3 == 0){
            System.out.print("Fizz");
        } else if (numero % 5 == 0){
            System.out.print("Buzz");
        } else {
            System.out.print(numero);
        }
        scan.close();
    }
}
