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

/**
 *
 * @author daniel
 */
public abstract class Procedimento implements MarcacaoProcedimento{
    private final String cpfDoPaciente;
    private LocalDateTime horario;

    public Procedimento(String cpfDoPaciente, LocalDateTime horario) {
        this.cpfDoPaciente = cpfDoPaciente;
        this.horario = horario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getCpfDoPaciente() {
        return cpfDoPaciente;
    }

    @Override
    public String toString() {
        return "Procedimento{" + "cpfDoPaciente=" + cpfDoPaciente + ", horario=" + horario + '}';
    }
    
    public int createBase(){
        String sql = "INSERT INTO Procedimento(CpfPaciente, Dia, Hora) Values('" + getCpfDoPaciente() + "','" + Date.valueOf(getHorario().toLocalDate()) + "','" + 
                Time.valueOf(getHorario().toLocalTime()) + "')";
        
        Conexao con = new Conexao();
        int res = con.executeUpdatewithId(sql);
        return res;
    }
    
    
}