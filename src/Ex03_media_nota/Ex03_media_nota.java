package Ex03_media_nota;

import entrada.Entrada;

public class Ex03_media_nota {

    public static void main(String[] args) {

        double nota1 = Entrada.leiaDouble("Primeira nota: ");
        double nota2 = Entrada.leiaDouble("Segunda nota: ");

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        System.exit(0);

    }

}