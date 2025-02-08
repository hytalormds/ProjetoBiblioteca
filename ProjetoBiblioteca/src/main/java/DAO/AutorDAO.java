package DAO;

import Conecta.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hytal
 */
public class AutorDAO {

    public void cadastrarAutor(String nome) {
        String insertQuery = "INSERT INTO Autor(nome) VALUES(?)";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, nome);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Autor cadastrado!");
            } else {
                System.out.println("Autor não cadastrado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarAutor(int ID_Autor, String nome) {
        String updateQuery = "UPDATE Autor SET nome = ? WHERE ID_Autor = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(updateQuery)) {

            /* Necessário colocar o ID também */
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, ID_Autor);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Autor Atualizado!");
            } else {
                System.out.println("Autor não atualizado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* Exclusão por id do autor cadastrado */
    public void excluirAutor(int ID_Autor) {
        String deleteQuery = "DELETE FROM Autor WHERE ID_Autor = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, ID_Autor);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Autor excluido");
            } else {
                System.out.println("Autor não excluido");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
