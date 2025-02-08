package DAO;

import Conecta.Conexao;
import Model.Livro;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author hytal
 */
public class EmprestimoDAO {

    public void cadastrarEmprestimo(Date Data_Emprestimo, Date Data_Devolucao, int Qtd_Livros, String Status, Usuario usuario, Livro livro) {
        String insertQuery = "INSERT INTO Emprestimo(Data_Emprestimo, Data_Devolucao, Qtd_Livros, Status, ID_Usuario, ID_Livro) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(insertQuery)) {

            preparedStatement.setDate(1, new java.sql.Date(Data_Emprestimo.getTime()));
            preparedStatement.setDate(2, new java.sql.Date(Data_Devolucao.getTime()));
            preparedStatement.setInt(3, Qtd_Livros);
            preparedStatement.setString(4, Status);
            preparedStatement.setInt(5, usuario.getIdUsuario());
            preparedStatement.setInt(6, livro.getIdLivro());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Emprestimo cadastrado!");
            } else {
                System.out.println("Emprestimo não cadastrado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarEmprestimo(int ID_Emprestimo, Date Data_Emprestimo, Date Data_Devolucao, int Qtd_Livros, String Status, Usuario usuario, Livro livro) {
        String updateQuery = "UPDATE Emprestimo SET Data_Emprestimo = ?, Data_Devolucao = ?, Qtd_Livros = ?, Status = ?, ID_Usuario = ?, ID_Livro = ? WHERE ID_Emprestimo = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            preparedStatement.setDate(1, new java.sql.Date(Data_Emprestimo.getTime()));
            preparedStatement.setDate(2, new java.sql.Date(Data_Devolucao.getTime()));
            preparedStatement.setInt(3, Qtd_Livros);
            preparedStatement.setString(4, Status);
            preparedStatement.setInt(5, usuario.getIdUsuario());
            preparedStatement.setInt(6, livro.getIdLivro());
            preparedStatement.setInt(7, ID_Emprestimo);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Empréstimo alterado!");
            } else {
                System.out.println("Empréstimo não atualizado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirEmprestimo(int ID_Emprestimo) {
        String deleteQuery = "DELETE FROM Emprestimo WHERE Id_Emprestimo = ?";

        try (Connection connection = Conexao.getConexao(); PreparedStatement preparedStatement
                = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, ID_Emprestimo);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Emprestimo excluido!");
            } else {
                System.out.println("Emprestimo não excluido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int pesquisarEmprestimo(int ID_Emprestimo) {
        return ID_Emprestimo;
    }
}

