package Ex07_caixa;

import entrada.Entrada;

public class Ex07_caixa {

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar != false) {

            int valor = Entrada.leiaInt("Valor do saque: ");
            int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };

            for (int cedula : cedulas) {

                int quantidade = valor / cedula;

                if (quantidade > 0) {
                    System.out.println(quantidade + " nota(s) de R$" + cedula);
                }

                valor = valor - (cedula * quantidade);

            }

            continuar = Entrada.leiaBoolean("Deseja realizar outro saque? (true/false): ");

        }

        System.exit(0);

    }

}