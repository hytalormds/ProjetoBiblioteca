package Model;

/**
 *
 * @author hytal
 */
public class Usuario {

    private int ID_Usuario;
    private String Nome;
    private String Email;
    private String Telefone;
    private int Idade;
    private String Sexo;

    private Endereco endereco;
    
    public Usuario () {}

    public Usuario(String nome, String email, String telefone, int idade, String sexo, Endereco endereco) {
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.endereco = endereco;
    }
    
    public Usuario(int ID_Usuario, String nome, String email, String telefone, int idade, String sexo, Endereco endereco) {
        this.ID_Usuario = ID_Usuario;
        this.Nome = nome;
        this.Email = email;
        this.Telefone = telefone;
        this.Idade = idade;
        this.Sexo = sexo;
        this.endereco = endereco;
    }

    public int getIdUsuario() {
        return ID_Usuario;
    }

    public void setIdUsuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
