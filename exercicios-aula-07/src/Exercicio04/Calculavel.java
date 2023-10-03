package Exercicio04;

public interface Calculavel {
    public static int adicao(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2) {
        return num1 - num2;
    }


    public static int multipilcar(int num1, int num2) {
        return num1 * num2;
    }

    public static int divisao(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    public static int calcular(Operacao operacao, int num1, int num2) throws ArithmeticException {
        switch (operacao) {
            case DIVISAO -> {
                return divisao(num1, num2);
            }
            case ADICAO -> {
                return adicao(num1, num2);

            }
            case SUBTRACAO -> {
                return subtracao(num1, num2);

            }
            case MULTIPLICACAO -> {
                return multipilcar(num1, num2);

            }
            default -> throw new IllegalArgumentException("Operação invalida");
        }
    }

}
// throw é uma palavra chave usada para declarar que o método pode ter  erros.Geralmente podemos
// usar a chamada de  bloco try-cath, mas nesse caso utilizei uma classe pronta que encontei em um artigo na internet
/// que serve para erros em operações como nesse caso.Possibilitando um código mais limpo

