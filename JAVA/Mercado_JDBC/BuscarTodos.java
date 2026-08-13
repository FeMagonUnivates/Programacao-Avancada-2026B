package Mercado_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BuscarTodos {
    
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/mercado";
        String usuario = "postgres";
        String senha = "postgres";
        
        String sqlTodos = "SELECT id, nome, preco FROM produtos";
        
        try (Connection conexao =
            DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstmt = conexao.prepareStatement(sqlTodos)) {
            
            System.out.println("Conectado!");
            
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
        
        System.exit(0);
        
    }
}
