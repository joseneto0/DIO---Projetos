import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class mediasTemperatura {
    public static void main(String[] args) {
        List<Integer> mediasMensais = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as 6 médias dos 6 primeiros meses");
        for (int i=0;i<6;i++){
            mediasMensais.add(scan.nextInt());
        }
        Iterator<Integer> iterator = mediasMensais.iterator();
        int soma = 0;
        while (iterator.hasNext()){
            int next = iterator.next();
            soma += next;
        }
        int mediaSemestral = soma / 6;
        System.out.println("Média Semestral: " + mediaSemestral + "°");
        System.out.println("Meses em que a média mensal foi maior que a média semestral: ");
        for (int i = 0; i < mediasMensais.size(); i++){
            if (mediasMensais.get(i) > mediaSemestral){
                switch (i){
                    case 0:
                        System.out.println(mediasMensais.get(i) + "° - Janeiro");
                        break;
                    case 1:
                        System.out.println(mediasMensais.get(i) + "° - Fevereiro");
                        break;
                    case 2:
                        System.out.println(mediasMensais.get(i) + "° - Março");
                        break;
                    case 3:
                        System.out.println(mediasMensais.get(i) + "° - Abril");
                        break;
                    case 4:
                        System.out.println(mediasMensais.get(i) + " - Maio");
                        break;
                    case 5:
                        System.out.println(mediasMensais.get(i) + " - Junho");
                        break;
                }
            }
        }
    }
}