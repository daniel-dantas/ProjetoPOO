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
public class Consulta implements Procedimento{
    
    private final String cpfDoPaciente;
    private LocalDateTime horarioDaConsulta;
    private String sintomas;
    private final String cpfDoMedico;

    public Consulta(String cpfDoPaciente, LocalDateTime horarioDaConsulta, String sintomas, String cpfDoMedico) {
        this.cpfDoPaciente = cpfDoPaciente;
        this.horarioDaConsulta = horarioDaConsulta;
        this.sintomas = sintomas;
        this.cpfDoMedico = cpfDoMedico;
    }

    public String getCpfDoPaciente() {
        return cpfDoPaciente;
    }

    public String getCpfDoMedico() {
        return cpfDoMedico;
    }
    
    public LocalDateTime getHorarioDaConsulta() {
        return horarioDaConsulta;
    }

    public void setHorarioDaConsulta(LocalDateTime horarioDaConsulta) {
        this.horarioDaConsulta = horarioDaConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Consulta{" + "cpfDoPaciente=" + cpfDoPaciente + ", horarioDaConsulta=" + horarioDaConsulta + ", sintomas=" + sintomas + ", cpfDoMedico=" + cpfDoMedico + '}';
    }
    
    
    
}
