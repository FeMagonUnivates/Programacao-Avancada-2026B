package Ex02_saudacao;

import entrada.Entrada;

public class Ex02_saudacao {

    public static void main(String[] args) {

        String nome = Entrada.leiaString("Nome: ");
        int idade = Entrada.leiaInt("Idade que fez/vai fazer esse ano: ");

        System.out.println("Olá " + nome + "!");
        System.out.println("No próximo ano você terá " + (idade + 1) + " anos.");

        System.exit(0);

    }

}