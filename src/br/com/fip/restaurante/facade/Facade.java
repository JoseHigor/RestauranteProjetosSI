/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fip.restaurante.facade;

import br.com.fip.restaurante.model.bean.Atendente;
import br.com.fip.restaurante.model.bean.Prato;
import br.com.fip.restaurante.model.bean.ProdutoPrato;
import br.com.fip.restaurante.model.dao.AtendenteDAO;
import br.com.fip.restaurante.model.dao.PratoDAO;
import br.com.fip.restaurante.model.dao.ProdutoPratoDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jh_an
 */
public class Facade {
    private AtendenteDAO atendenteDAO = new AtendenteDAO();
    private PratoDAO pratoDAO = new PratoDAO();
    private ProdutoPratoDAO produtoPratoDAO = new ProdutoPratoDAO();
    
    public void salvarAtendente(Atendente a){
        try {
            atendenteDAO.save(a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public Atendente buscarAtendente(long id){
        try {
            return atendenteDAO.find(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void editarAtendente(Atendente a){
        try {
            atendenteDAO.update(a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public void removerAtendente(Atendente a){
        try {
            atendenteDAO.remove(a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public List<Atendente> listarAtendente(Atendente a){
        try {
            return atendenteDAO.all();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void salvarPrato(Prato p){
        try {
            pratoDAO.save(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public Prato buscarPrato(long id){
        try {
            return pratoDAO.find(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void editarPrato(Prato p){
        try {
            pratoDAO.update(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public void removerPrato(Prato p){
        try {
            pratoDAO.remove(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public List<Prato> listarPrato(Prato p){
        try {
            return pratoDAO.all();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void salvarProdutoPrato(ProdutoPrato pp){
        try {
            produtoPratoDAO.save(pp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public ProdutoPrato buscarProdutoPrato(long id){
        try {
            return produtoPratoDAO.find(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void editarProdutoPrato(ProdutoPrato pp){
        try {
            produtoPratoDAO.update(pp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public void removerAtendente(ProdutoPrato pp){
        try {
            produtoPratoDAO.remove(pp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public List<ProdutoPrato> listarAtendente(ProdutoPrato pp){
        try {
            return produtoPratoDAO.all();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }   
}
