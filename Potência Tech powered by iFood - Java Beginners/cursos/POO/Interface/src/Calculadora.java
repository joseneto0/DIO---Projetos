class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(int numero1, int numero2) {
        System.out.println("Soma entre " + numero1 + " e " + numero2 + " = " + (numero1+numero2));
    }
    @Override
    public void subtracao(int numero1, int numero2) {
        System.out.println("Subtração entre " + numero1 + " e " + numero2 + " = " + (numero1-numero2));
    }

    @Override
    public void multiplicacao(int numero1, int numero2) {
        System.out.println("Multiplicação entre " + numero1 + " e " + numero2 + " = " + (numero1*numero2));
    }

    @Override
    public void divisao(int numero1, int numero2) {
        System.out.println("Divisão entre " + numero1 + " e " + numero2 + " = " + (numero1/numero2));
    }
}