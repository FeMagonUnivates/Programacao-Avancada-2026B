package Mercado_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entrada.Entrada;
import java.sql.ResultSet;

public class BuscarItem {
    
    public static void executar() {
        
        String url = "jdbc:postgresql://localhost:5432/mercado";
        String usuario = "postgres";
        String senha = "postgres";
        
        String busca = Entrada.leiaString("Digite qual produto você quer pesquisar:");
        String sqlUm = "SELECT id, nome, preco FROM produtos WHERE nome ILIKE ?";
        
        try (Connection conexao =
            DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstmt = conexao.prepareStatement(sqlUm)) {
            
            System.out.println("Conectado!");
            
            pstmt.setString(1, "%" + busca + "%");
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Preço: R$" + rs.getString("preco"));
                System.out.println();
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar.");
            e.printStackTrace();
        }
        
    }
}
