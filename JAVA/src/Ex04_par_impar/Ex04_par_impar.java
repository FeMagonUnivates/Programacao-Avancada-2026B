package Ex04_par_impar;

import entrada.Entrada;

public class Ex04_par_impar {

    public static void main(String[] args) {

        int n = Entrada.leiaInt("Digite um número: ");

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par.");
        } else {
            System.out.println("O número " + n + " é ímpar.");
        }

        System.exit(0);
    }

}