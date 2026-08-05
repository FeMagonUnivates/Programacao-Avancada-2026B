package Ex05_confirmar_compra;

import entrada.Entrada;

public class Ex05_confirmar_compra {

    public static void main(String[] args) {

        String produto = Entrada.leiaString("Nome do produto: ");
        double preco = Entrada.leiaDouble("Preço: ");

        boolean confirmar = Entrada.leiaBoolean("Deseja confirmar a compra? (true/false): ");

        if (confirmar == true) {
            System.out.println("Produto: " + produto);
            System.out.println("Preço: R$" + preco);
        } else {
            System.out.println("A compra foi cancelada.");
        }

        System.exit(0);

    }

}