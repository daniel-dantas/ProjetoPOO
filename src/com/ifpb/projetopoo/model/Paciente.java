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
 * @author Ruan
 */
public class Paciente extends Pessoa{
    
    List <String> descricao;
    List <MarcacaoProcedimento> procedimentos;

    public Paciente(String cpf, String nome, LocalDate nascimento, Endereco endereco, Contato contato) {
        super(cpf, nome, nascimento, endereco, contato);
        descricao = new ArrayList<>();
        procedimentos = new ArrayList<>();
    }

    public List<String> getDescricao() {
        return descricao;
    }

    public void addDescricao(String descricao) {
        this.descricao.add(descricao);
    }

    public List<MarcacaoProcedimento> getProcedimentos() {
        return procedimentos;
    }

    public void addProcedimento (MarcacaoProcedimento procedimento) {
        procedimentos.add(procedimento);
    }
}