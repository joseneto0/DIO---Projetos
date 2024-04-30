import java.util.Scanner;

public class Contador{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNum = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNum = scanner.nextInt();
        
        try {
            contar(primeiroNum, segundoNum);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
        scanner.close();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
	}
}

class ParametrosInvalidosException extends Exception{
    
}