package Ex06_sequencia_numero;

import entrada.Entrada;

public class Ex06_sequencia_numero {

    public static void main(String[] args) {

        int n = Entrada.leiaInt("Quantos números deseja informar?");
        int contador = 0;

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            int numero = Entrada.leiaInt("Número " + i + ":");
            contador += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

        }

        double media = (double) contador / n;

        System.out.println("Soma dos números = " + contador);
        System.out.println("Média = " + media);
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);

        System.exit(0);

    }

}