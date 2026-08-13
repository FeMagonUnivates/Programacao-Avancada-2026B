package Mercado_JDBC;

import entrada.Entrada;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarVarios {
    
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/mercado";
        String usuario = "postgres";
        String senha = "postgres";
        
        String sqlCadastra = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";
        
        try (Connection conexao =
            DriverManager.getConnection(url, usuario, senha);
            PreparedStatement pstmt = conexao.prepareStatement(sqlCadastra)) {
            
            System.out.println("Conectado!");
            
            boolean continuar = true;
            
            while (continuar != false) {
                
                String nome = Entrada.leiaString("Nome do produto:");
                double preco = Entrada.leiaDouble("Valor do produto:");
                
                pstmt.setString(1, nome);
                pstmt.setDouble(2, preco);
                pstmt.executeUpdate();
                
                System.out.println("Produto cadastrado.");
                
                continuar = Entrada.leiaBoolean("Deseja cadastrar outro produto? (true/false): ");
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar.");
            e.printStackTrace();
        }
        
        System.exit(0);
    }
}
