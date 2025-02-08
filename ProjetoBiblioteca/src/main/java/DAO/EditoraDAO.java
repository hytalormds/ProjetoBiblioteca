package DAO;

import Conecta.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hytal
 */
public class EditoraDAO {

    public void cadastrarEditora(String nome) {
        String insertQuery = "INSERT INTO Editora(nome) VALUES(?)";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, nome);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Editora cadastrada!");
            } else {
                System.out.println("Autor não cadastrado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarEditora(int ID_Editora, String nome) {
        String updateQuery = "UPDATE Editora SET nome = ? WHERE ID_Editora";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, ID_Editora);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Editora atualizada!");
            } else {
                System.out.println("Editora não atualizada");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirEditora(int ID_Editora) {
        String deleteQuery = "DELETE FROM Editora WHERE ID_Editora = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, ID_Editora);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Editora excluida!");
            } else {
                System.out.println("Editora não excluuida!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
