package Model;

/**
 *
 * @author hytal
 */
public class Endereco {

    private int ID_Endereco;
    private String Rua;
    private int Numero;
    private String Referencia;
    
    public Endereco () {}

    public Endereco(int ID_Endereco, String Rua, int Numero, String Referencia) {
        this.ID_Endereco = ID_Endereco;
        this.Rua = Rua;
        this.Numero = Numero;
        this.Referencia = Referencia;
    }

    public int getIdEndereco() {
        return ID_Endereco;
    }

    public void setIdEndereco(int ID_Endereco) {
        this.ID_Endereco = ID_Endereco;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }
}
