/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Atendente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class AtendenteDAO implements DAO<Atendente>{
    
    private static final List<Atendente> listaAtendentes = new ArrayList<>();
    
    @Override
    public boolean create(Atendente elemento) {
        listaAtendentes.add(elemento);
        return true;
    }

    @Override
    public boolean update(Atendente elemento, Atendente novoElemento) {
        
        for(int i = 0 ; i < listaAtendentes.size();i++){
            if(listaAtendentes.get(i).equals(elemento)){
                listaAtendentes.remove(i);
                listaAtendentes.add(novoElemento);
                return true;
            }
        }
        
        return false;
        
    }

    @Override
    public boolean remove(Atendente elemento) {
        
        for(int i = 0 ; i < listaAtendentes.size(); i++){
            if(listaAtendentes.get(i).equals(elemento)){
                listaAtendentes.remove(i);
                return true;
            }
        }
        
        return false;
    }

    @Override
    public List<Atendente> read() {
        return listaAtendentes;
    }
    
    public boolean autenticar(String usuario, String senha){
        
        for(Atendente ate : listaAtendentes){
            if(ate.getUsuario().equals(usuario) && ate.getSenha().equals(senha)){
                return true;
            }
        }
        
        return false;
        
    }
    
    
}
