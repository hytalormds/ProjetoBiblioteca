package Model;

/**
 *
 * @author hytal
 */
public class Autor {

    private int ID_Autor;
    private String nome;

    public Autor() {}
    
    public Autor(String nome) {
        this.ID_Autor = ID_Autor;
    }

    public Autor(int ID_Autor, String nome) {
        this.ID_Autor = ID_Autor;
        this.nome = nome;
    }
    
    public int getIdAutor() {
        return ID_Autor;
    }

    public void setIdAutor(int ID_Autor) {
        this.ID_Autor = ID_Autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
