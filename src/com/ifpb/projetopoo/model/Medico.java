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

public class Medico extends Pessoa{
    private float salario;
    private LocalDate dataAdmissao;
    private List<String> especialidades;

    public Medico(float salario, LocalDate dataAdmissao, List<String> especialidades, String cpf, String nome, LocalDate nascimento, Endereco endereco, Contato contato) {
        super(cpf, nome, nascimento, endereco, contato);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.especialidades = new ArrayList<>();
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

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void addEspecialidade(String especialidade) {
        this.especialidades.add(especialidade);
    }
    
}
