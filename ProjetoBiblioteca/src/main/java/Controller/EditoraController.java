/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.EditoraDAO;
import Model.Editora;

/**
 *
 * @author hytal
 */
public class EditoraController {
    private EditoraDAO editoraDAO;
    
    public EditoraController(){
        this.editoraDAO = new EditoraDAO();
    }
    
    public void cadastrarEditora(String Nome){
        Editora editora = new Editora(Nome);
        
        editoraDAO.cadastrarEditora(Nome);
    }
    
    public void alterarEditora(int ID_Editora, String Nome){
        Editora editora = new Editora(ID_Editora, Nome);
        
        editoraDAO.alterarEditora(ID_Editora, Nome);
    }
    
    public void excluirEditora(int ID_Editora) {
        editoraDAO.excluirEditora(ID_Editora);
    }
}
