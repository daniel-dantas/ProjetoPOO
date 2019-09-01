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
public class Exame extends Procedimento{
    
    
    private String descricaoDoExame;
    private String tipoDeExame;
    private String resultado;

    public Exame(String descricaoDoExame, String tipoDeExame, String resultado, String cpfDoPaciente, LocalDateTime horario) {
        super(cpfDoPaciente, horario);
        this.descricaoDoExame = descricaoDoExame;
        this.tipoDeExame = tipoDeExame;
        this.resultado = resultado;
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
        return "Exame{" +"cpf do pacinte="+getCpfDoPaciente()+",horario="+getHorario()+ ",descricaoDoExame=" + descricaoDoExame + ", tipoDeExame=" + tipoDeExame + ", resultado=" + resultado + '}';
    }
}
