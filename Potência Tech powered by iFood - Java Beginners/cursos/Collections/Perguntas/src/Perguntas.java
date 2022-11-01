import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perguntas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Boolean> respostasPositivas = new ArrayList<Boolean>();
        System.out.println("Telefonou para a vítima? [1 - Sim | 2 - Não]");
        int r = scan.nextInt();
        if (r == 1){
            respostasPositivas.add(Boolean.TRUE);
        }
        System.out.println("Esteve no local? [1 - Sim | 2 - Não]");
        int r1 = scan.nextInt();
        if (r1 == 1){
            respostasPositivas.add(Boolean.TRUE);
        }
        System.out.println("Mora perto da vítima? [1 - Sim | 2 - Não]");
        int r2 = scan.nextInt();
        if (r2 == 1){
            respostasPositivas.add(Boolean.TRUE);
        }
        System.out.println("Devia para a vítima? [1 - Sim | 2 - Não]");
        int r3 = scan.nextInt();
        if (r3   == 1){
            respostasPositivas.add(Boolean.TRUE);
        }
        System.out.println("Ja trabalhou com a vítima? [1 - Sim | 2 - Não]");
        int r4 = scan.nextInt();
        if (r4 == 1){
            respostasPositivas.add(Boolean.TRUE);
        }
        int positivos = respostasPositivas.size();
        switch (positivos) {
            case 2 -> System.out.println("Você é Suspeito!");
            case 3, 4 -> System.out.println("Você é Cúmplice!");
            case 5 -> System.out.println("CULPADO! VOCÊ MATOU A VÍTIMA");
            default -> System.out.println("Inocente");
        }
    }
}