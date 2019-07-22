/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

import java.time.LocalDate;

/**
 *
 * @author daniel
 */
public abstract class Pessoa {
    
    //CPF vai ser o identificador no banco
    private final String cpf;
    private String nome;
    private LocalDate nascimento;
    private Endereco endereco;
    private Contato contato;

    public Pessoa(String cpf, String nome, LocalDate nascimento, Endereco endereco, Contato contato) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.contato = contato;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
    
    
    
    
}
