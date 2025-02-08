package Conecta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hytal
 */
public class Conexao {
    
        private static final String URL = "jdbc:mysql://localhost:3306/bdbiblioteca";
        private static final String USER = "root";  // Substitua pelo seu usuário
        private static final String PASSWORD = " ";  // Substitua pela sua senha

        public static Connection getConexao() {
            try {
                return DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException("Erro na conexão com o banco de dados!", e);
            }
        }
    }
