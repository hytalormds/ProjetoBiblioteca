package DAO;

import Conecta.Conexao;
import Model.Autor;
import Model.Editora;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hytal
 */
public class LivroDAO {

    public void cadastrarLivro(String Titulo, int Ano_Publicacao, String Status, Autor autor, Editora editora) {
        String insertQuery = "INSERT INTO Livros(Titulo, Ano_Publicacao, ID_Autor, ID_Editora) VALUES(?, ?, ?, ?, ?)";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, Titulo);
            preparedStatement.setInt(2, Ano_Publicacao);
            preparedStatement.setInt(3, autor.getIdAutor());
            preparedStatement.setInt(4, editora.getIdEditora());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Livro cadastrado!");
            } else {
                System.out.println("Livro não excluido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarLivro(int ID_Livro, String Titulo, int Ano_Publicacao, String Status, Autor autor, Editora editora) {
        String updateQuery = "UPDATE Livros SET Titulo = ?, Ano_Publicacao = ?, ID_Autor = ?, ID_Editora = ? WHERE ID_Livro = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, Titulo);
            preparedStatement.setInt(2, Ano_Publicacao);
            preparedStatement.setInt(3, autor.getIdAutor());
            preparedStatement.setInt(4, editora.getIdEditora());
            preparedStatement.setInt(5, ID_Livro);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Livro atualizado!");
            } else {
                System.out.println("Livro não atualizado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirLivro(int ID_Livro) {
        String deleteQuery = "DELETE FROM Livros WHERE ID_Livro = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, ID_Livro);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Livro excluido!");
            } else {
                System.out.println("Livro não escluido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String pesquisarLivro(String titulo) {
        return titulo;
    }
}
