package Ex01_soma;

import entrada.Entrada;

public class Ex01_soma {

    public static void main(String[] args) {

        int a = Entrada.leiaInt("Digite o primeiro número: ");
        int b = Entrada.leiaInt("Digite o segundo número: ");

        int soma = a + b;

        System.out.println("Soma = " + soma);

        System.exit(0);

    }
}