package Model;

/**
 *
 * @author hytal
 */
public class Livro {

    private int ID_Livro;
    private String Titulo;
    private int Ano_Publicacao;

    private Autor autor;
    private Editora editora;
    
    public Livro () {}

    public Livro(int ID_Livro, String Titulo, int Ano_Publicacao, Autor autor, Editora editora) {
        this.ID_Livro = ID_Livro;
        this.Titulo = Titulo;
        this.Ano_Publicacao = Ano_Publicacao;
        this.autor = autor;
        this.editora = editora;
    }

    public int getIdLivro() {
        return ID_Livro;
    }

    public void setIdLivro(int ID_Livro) {
        this.ID_Livro = ID_Livro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnoPublicacao() {
        return Ano_Publicacao;
    }

    public void setAnoPublicacao(int Ano_Aublicacao) {
        this.Ano_Publicacao = Ano_Publicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
