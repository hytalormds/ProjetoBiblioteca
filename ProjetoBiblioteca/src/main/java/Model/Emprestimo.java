package Model;

import java.sql.Date;

/**
 *
 * @author hytal
 */
public class Emprestimo {

    private int ID_Emprestimo;
    private int ID_Usuario;
    private int ID_Livro;
    private Date Data_Emprestimo;
    private Date Data_Devolucao;
    private String Status;
    private int Qtd_Livros;

    private Usuario usuario;
    private Livro livro;
    
    public Emprestimo (){}

    private Emprestimo(int ID_Emprestimo, int ID_Usuario, int ID_Livro, Date Data_Emprestimo, Date Data_Devolucao, int Qtd_Livros, String Status, Usuario usuario, Livro livro) {
        this.ID_Usuario = ID_Usuario;
        this.ID_Emprestimo = ID_Emprestimo;
        this.ID_Livro = ID_Livro;
        this.Data_Emprestimo = Data_Emprestimo;
        this.Data_Devolucao = Data_Devolucao;
        this.Qtd_Livros = Qtd_Livros;
        this.Status = Status;
        this.usuario = usuario;
        this.livro = livro;
    }

    public int getIdUsuario() {
        return ID_Usuario;
    }

    public void setIdUsuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public int getIdEmprestimo() {
        return ID_Emprestimo;
    }

    public void setIdEmprestimo(int ID_Emprestimo) {
        this.ID_Emprestimo = ID_Emprestimo;
    }

    public int getIdLivro() {
        return ID_Livro;
    }

    public void setIdLivro(int ID_Livro) {
        this.ID_Livro = ID_Livro;
    }

    public Date getDataEmprestimo() {
        return Data_Emprestimo;
    }

    public void setDataEmprestimo(Date Data_Emprestimo) {
        this.Data_Emprestimo = Data_Emprestimo;
    }

    public Date getDataDevolucao() {
        return Data_Devolucao;
    }

    public void setDataDevolucao(Date Data_Devolucao) {
        this.Data_Devolucao = Data_Devolucao;
    }

    public int getQtdLivros() {
        return Qtd_Livros;
    }

    public void setQtdLivros(int Qtd_Livros) {
        this.Qtd_Livros = Qtd_Livros;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String Status){
        this.Status = Status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
