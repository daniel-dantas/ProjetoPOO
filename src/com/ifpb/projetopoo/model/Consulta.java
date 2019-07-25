/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

import java.time.LocalDateTime;

/**
 *
 * @author daniel
 */
public class Consulta extends Procedimento implements MarcacaoProcedimento{
    
    private String sintomas;
    private final String cpfDoMedico;

    public Consulta(String sintomas, String cpfDoMedico, String cpfDoPaciente, LocalDateTime horario) {
        super(cpfDoPaciente, horario);
        this.sintomas = sintomas;
        this.cpfDoMedico = cpfDoMedico;
    }

    public String getCpfDoMedico() {
        return cpfDoMedico;
    }
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Consulta{"+"cpf do pacinte="+getCpfDoPaciente()+",horario="+getHorario()+",sintomas=" + sintomas + ", cpfDoMedico=" + cpfDoMedico + '}';
    }

    
    
    
    
}
