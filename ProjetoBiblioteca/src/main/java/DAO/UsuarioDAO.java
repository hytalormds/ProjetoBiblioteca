package DAO;

import Conecta.Conexao;
import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hytal
 */
public class UsuarioDAO {

    public void cadastrarUsuario(String Nome, String Email, String Telefone, int Idade, String Sexo, Endereco endereco) {
        String insertQuery = "INSERT INTO Usuario (Nome, Email, Telefone, Idade, Sexo, ID_Endereco) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, Nome);
            preparedStatement.setString(2, Email);
            preparedStatement.setString(3, Telefone);
            preparedStatement.setInt(4, Idade);
            preparedStatement.setString(5, Sexo);
            preparedStatement.setInt(6, endereco.getIdEndereco());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuario cadastrado!");
            } else {
                System.out.println("Usuario não cadastrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarUsuario(int ID_Usuario, String Nome, String Email, String Telefone, int Idade, String Sexo, Endereco endereco) {
        String updateQuery = "UPDATE Usuario SET Nome = ?, Email = ?, Telefone = ?, Idade = ?, Sexo = ?, ID_Endereco = ? WHERE ID_Usuario = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, Nome);
            preparedStatement.setString(2, Email);
            preparedStatement.setString(3, Telefone);
            preparedStatement.setInt(4, Idade);
            preparedStatement.setString(5, Sexo);
            preparedStatement.setInt(6, endereco.getIdEndereco());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuario atualizado!");
            } else {
                System.out.println("Usuario não atualizado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirUsuario(int ID_Usuario) {
        String deleteQuery = "DELETE FROM Usuario WHERE Id_Usuario = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, ID_Usuario);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuario excluido!");
            } else {
                System.out.println("Usuario não excluido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String pesquisarUsuario(String nome) {
        return nome;
    }
}

