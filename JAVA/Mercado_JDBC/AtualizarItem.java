package Mercado_JDBC;

import entrada.Entrada;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class AtualizarItem {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/mercado";
        String usuario = "postgres";
        String senha = "postgres";

        String sqlBusca = "SELECT id, nome, preco FROM produtos";

        try (Connection conexao = 
            DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstmt = conexao.prepareStatement(sqlBusca)) {

            System.out.println("Conectado!");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Preço: R$" + rs.getString("preco"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar.");
        }

        int idBusca = Entrada.leiaInt("Digite o ID do produto que quer atualizar:");

        String novoNome = Entrada.leiaString("Nome do produto:");
        double novoPreco = Entrada.leiaDouble("Valor do produto:");

        String sqlUpdate = "UPDATE produtos SET nome = ?, preco = ? WHERE id = ?";

        try (Connection conexao = 
            DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstmt = conexao.prepareStatement(sqlUpdate)) {

            pstmt.setString(1, novoNome);
            pstmt.setDouble(2, novoPreco);
            pstmt.setInt(3, idBusca);

            int linhasAlteradas = pstmt.executeUpdate();

            if (linhasAlteradas > 0) {
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Produto não encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar.");
        }

        String sqlUm = "SELECT id, nome, preco FROM produtos WHERE id = ?";

        try (Connection conexao =
            DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstmt = conexao.prepareStatement(sqlUm)) {

            pstmt.setInt(1, idBusca);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println();
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Preço: R$" + rs.getString("preco"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar.");
            e.printStackTrace();
        }

        System.exit(0);

    }
}
