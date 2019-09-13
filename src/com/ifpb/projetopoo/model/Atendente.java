/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

import com.ifpb.projetopoo.dao.Conexao;
import java.io.Serializable;
import java.sql.Date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
/**
 *
 * @author IGOR
 */
public class Atendente extends Pessoa implements Serializable{
    
    private float salario;
    private LocalDate dataAdmissao;
    private String usuario;
    private String senha;

    public Atendente(String usuario, String senha, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    public Atendente(float salario, LocalDate dataAdmissao, String cpf, String nome, LocalDate nascimento, String usuario, String senha, Endereco endereco, Contato contato) {
        super(cpf, nome, nascimento, endereco, contato);
        
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
    
    
    @Override
    public String toString() {
        return "Atendente{" + "salario=" + salario + ", dataAdmissao=" + dataAdmissao + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
    
}
