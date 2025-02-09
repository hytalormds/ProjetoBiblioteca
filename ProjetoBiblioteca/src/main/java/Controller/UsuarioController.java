package Controller;

import DAO.UsuarioDAO;
import Model.Endereco;
import Model.Usuario;

/**
 *
 * @author hytal
 */
public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void cadastrarUsuario(String Nome, String Email, String Telefone, int Idade, String Sexo, Endereco endereco) {
        Usuario usuario = new Usuario(Nome, Email, Telefone, Idade, Sexo, endereco);
        usuarioDAO.cadastrarUsuario(
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getTelefone(),
                usuario.getIdade(),
                usuario.getSexo(),
                usuario.getEndereco()
        );
    }

    public void alterarUsuario(int ID_Usuario, String Nome, String Email, String Telefone, int Idade, String Sexo, Endereco endereco) {
        Usuario usuario = new Usuario(ID_Usuario, Nome, Email, Telefone, Idade, Sexo, endereco);

        usuarioDAO.alterarUsuario(
                usuario.getIdUsuario(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getTelefone(),
                usuario.getIdade(),
                usuario.getSexo(),
                usuario.getEndereco()
        );
    }

    public void excluirUsuario(int ID_Usuario) {
        usuarioDAO.excluirUsuario(ID_Usuario);
    }
}
