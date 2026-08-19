package Mercado_JDBC;

import entrada.Entrada;

public class mercado {

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {

            opcao = Entrada.leiaInt("Escolha uma opção: \n \n" +
                    "1 - Cadastrar \n" +
                    "2 - Listar \n" +
                    "3 - Buscar \n" +
                    "4 - Atualizar \n" +
                    "5 - Remover \n" +
                    "0 - Sair \n \n");

            switch (opcao) {

                case 1:
                    CadastrarVarios.executar();
                    break;

                case 2:
                    BuscarTodos.executar();
                    break;

                case 3:
                    BuscarItem.executar();
                    break;

                case 4:
                    AtualizarItem.executar();
                    break;

                case 5:
                    DeletarItem.executar();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        
        System.exit(0);
    }
}