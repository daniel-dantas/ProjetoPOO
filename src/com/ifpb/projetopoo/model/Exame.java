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
public class Exame implements Procedimento{
    
    private final String cpfDoPaciente;
    private LocalDateTime horarioDoExame;
    private String descricaoDoExame;
    private String tipoDeExame;
    private String resultado;

    public Exame(String cpfDoPaciente, String descricaoDoExame, String tipoDeExame, LocalDateTime horarioDoExame) {
        this.cpfDoPaciente = cpfDoPaciente;
        this.descricaoDoExame = descricaoDoExame;
        this.tipoDeExame = tipoDeExame;
        this.horarioDoExame = horarioDoExame;
    }

    public LocalDateTime getHorarioDoExame() {
        return horarioDoExame;
    }

    public void setHorarioDoExame(LocalDateTime horarioDoExame) {
        this.horarioDoExame = horarioDoExame;
    }
    
    public String getCpfDoPaciente() {
        return cpfDoPaciente;
    }


    public String getDescricaoDoExame() {
        return descricaoDoExame;
    }

    public void setDescricaoDoExame(String descricaoDoExame) {
        this.descricaoDoExame = descricaoDoExame;
    }

    public String getTipoDeExame() {
        return tipoDeExame;
    }

    public void setTipoDeExame(String tipoDeExame) {
        this.tipoDeExame = tipoDeExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Exame{" + "cpfDoPaciente=" + cpfDoPaciente + ", horarioDoExame=" + horarioDoExame + ", descricaoDoExame=" + descricaoDoExame + ", tipoDeExame=" + tipoDeExame + ", resultado=" + resultado + '}';
    }
    
    
    
    
}
