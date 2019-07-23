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
public class Procedimento {
    
    private final String cpfDoPaciente;
    private LocalDateTime horario;
    private TipoDeProcedimento tipoDeProcedimento;

    public Procedimento(String cpfDoPaciente, LocalDateTime horario, TipoDeProcedimento tipoDeProcedimento) {
        this.cpfDoPaciente = cpfDoPaciente;
        this.horario = horario;
        this.tipoDeProcedimento = tipoDeProcedimento;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public TipoDeProcedimento getTipoDeProcedimento() {
        return tipoDeProcedimento;
    }

    public void setTipoDeProcedimento(TipoDeProcedimento tipoDeProcedimento) {
        this.tipoDeProcedimento = tipoDeProcedimento;
    }
    
    
    
}
