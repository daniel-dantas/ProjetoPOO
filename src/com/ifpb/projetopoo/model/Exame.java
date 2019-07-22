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
public class Exame {
    private String tipoDeExame;
    private LocalDateTime horarioDoExame;

    public Exame(String tipoDeExame, LocalDateTime horarioDoExame) {
        this.tipoDeExame = tipoDeExame;
        this.horarioDoExame = horarioDoExame;
    }

    public String getTipoDeExame() {
        return tipoDeExame;
    }

    public void setTipoDeExame(String tipoDeExame) {
        this.tipoDeExame = tipoDeExame;
    }

    public LocalDateTime getHorarioDoExame() {
        return horarioDoExame;
    }

    public void setHorarioDoExame(LocalDateTime horarioDoExame) {
        this.horarioDoExame = horarioDoExame;
    }
    
    
    
    
}
