/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AutorDAO;
import Model.Autor;

/**
 *
 * @author hytal
 */
public class AutorController {
    private AutorDAO autorDAO;

    public AutorController() {
        this.autorDAO = new AutorDAO();
    }
    
    public void cadastrarAutor(String Nome){
        Autor autor = new Autor(Nome);
        
        autorDAO.cadastrarAutor(Nome);
    }
    
    public void alterarAutor(int ID_Autor, String Nome){
        Autor autor = new Autor(ID_Autor, Nome);
        
        autorDAO.alterarAutor(ID_Autor, Nome);
    }
    
    public void excluirAutor(int ID_Usuario) {
        autorDAO.excluirAutor(ID_Usuario);
    }
}
