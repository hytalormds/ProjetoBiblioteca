package Model;

/**
 *
 * @author hytal
 */
public class Editora {

    private int ID_Editora;
    private String nome;
    
    public Editora (){}

    public Editora(String nome) {
        this.nome = nome;
    }
    
    public Editora(int ID_Editora, String nome) {
        this.ID_Editora = ID_Editora;
        this.nome = nome;
    }

    public int getIdEditora() {
        return ID_Editora;
    }

    public void setIdEditora(int ID_Editora) {
        this.ID_Editora = ID_Editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
