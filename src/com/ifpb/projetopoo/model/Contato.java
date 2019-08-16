/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

/**
 *
 * @author daniel
 */
public class Contato {
    private String email;
    private String telefone;

    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }
    
    public Contato(String telefone){
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
