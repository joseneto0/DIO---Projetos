public class Main {
    public static void main(String[] args) {
        Carro primeiro_carro = new Carro("Branco", "Gol", 45);
        System.out.println(primeiro_carro.getCor());
        System.out.println(primeiro_carro.getModelo());
        System.out.println(primeiro_carro.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque do " + primeiro_carro.getModelo() + " R$ " + primeiro_carro.valorEncherTanque(4.5));
        System.out.println();
        Carro segundo_carro = new Carro();
        segundo_carro.setCor("Amarelo");
        segundo_carro.setModelo("Camaro");
        segundo_carro.setCapacidadeTanque(55);
        System.out.println(segundo_carro.getCor());
        System.out.println(segundo_carro.getModelo());
        System.out.println(segundo_carro.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque do " + segundo_carro.getModelo() + " R$ " + segundo_carro.valorEncherTanque(4.5));
    }
}
