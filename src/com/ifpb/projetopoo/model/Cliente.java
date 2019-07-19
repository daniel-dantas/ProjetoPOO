/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Cliente extends Pessoa{
    
    private List<Livro> livrosLocados;
    
    public Cliente(String cpf, String nome, LocalDate nascimento, Endereco endereco, Contato contato) {
        super(cpf, nome, nascimento, endereco, contato);
        this.livrosLocados = new ArrayList<>();
    }
    
    public void locarLivro(Livro livro){
        this.livrosLocados.add(livro);
        
    }
    
    public List<Livro> getLivrosLocados(){
        return livrosLocados;
    }
    
    
    
}
