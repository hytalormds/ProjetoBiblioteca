package DAO;

import Conecta.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hytal
 */
public class EnderecoDAO {

    public void cadastrarEndereco(String Rua, int Numero, String Referencia) {
        String insertQuery = "INSERT INTO Endereco(Rua, Numero, Referencia) VALUES(?, ?, ?)";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, Rua);
            preparedStatement.setInt(2, Numero);
            preparedStatement.setString(3, Referencia);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Endereço cadastrado!");
            } else {
                System.out.println("Endereço nã cadastrado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarEndereco(int ID_Endereco, String Rua, int Numero, String Referencia) {
        String updateQuery = "UPDATE Endereco SET Rua = ?, Numero = ?, Referencia = ? WHERE ID_Endereco = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, Rua);
            preparedStatement.setInt(2, Numero);
            preparedStatement.setString(3, Referencia);
            preparedStatement.setInt(4, ID_Endereco);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Endereco atualizado!");
            } else {
                System.out.println("Endereco não atualizado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirEndereco(int ID_Endereco) {
        String deleteQuery = "DELETE FROM Endereco WHERE ID_Endereco = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, ID_Endereco);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Endereco excluido!");
            } else {
                System.out.println("Endereco não excluido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

