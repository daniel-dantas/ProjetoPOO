/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

import com.ifpb.projetopoo.dao.Conexao;
import java.time.LocalDateTime;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class Procedimento implements MarcacaoProcedimento{
    private long id;
    private final String cpfDoPaciente;
    private LocalDateTime horario;

    public Procedimento(String cpfDoPaciente, LocalDateTime horario) {
        this.cpfDoPaciente = cpfDoPaciente;
        this.horario = horario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getCpfDoPaciente() {
        return cpfDoPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.horario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Procedimento other = (Procedimento) obj;
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Procedimento{" + "cpfDoPaciente=" + cpfDoPaciente + ", horario=" + horario + '}';
    }
}