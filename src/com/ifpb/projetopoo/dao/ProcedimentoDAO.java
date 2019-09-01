/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Consulta;
import com.ifpb.projetopoo.model.Exame;
import com.ifpb.projetopoo.model.Procedimento;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFPB
 */
public class ProcedimentoDAO {
    
    private int id;
    private String cpfPaciente;
    private LocalDateTime momento;

    public ProcedimentoDAO(int id, String cpfPaciente, LocalDateTime momento) {
        this.id = id;
        this.cpfPaciente = cpfPaciente;
        this.momento = momento;
    }
    
    public ProcedimentoDAO() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPciente) {
        this.cpfPaciente = cpfPciente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public int create(Procedimento elemento) {
        String sql = "INSERT INTO Procedimento(CpfPaciente, Dia, Hora) Values('" + elemento.getCpfDoPaciente() + "','" + Date.valueOf(elemento.getHorario().toLocalDate()) + 
                "','" + Time.valueOf(elemento.getHorario().toLocalTime()) + "')";
        
        Conexao con = new Conexao();
        int res = con.executeUpdatewithId(sql);
        return res;
    }
    
    public boolean update(int id, Procedimento elemento) {
        String sql = "UPDATE Procedimento SET Dia='" + Date.valueOf(elemento.getHorario().toLocalDate()) + "', Hora='" + Time.valueOf(elemento.getHorario().toLocalTime()) + 
                "' WHERE Id=" + id;
        
        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);
        
        return resultado >= 1;
    }
    
    public List <ProcedimentoDAO> readPrimario(String Cpf){
        List <ProcedimentoDAO> procedimentos = new ArrayList<>();
        String sql = "SELECT * FROM Procedimento";
        sql += " Where CpfPaciente='" + Cpf + "'";
        Conexao con = new Conexao();
        try{
            ResultSet consulta = con.executeQuery(sql);
            while(consulta.next()){
                procedimentos.add(new ProcedimentoDAO(consulta.getInt("Id"), consulta.getString("CpfPaciente"), LocalDateTime.of(consulta.getDate("Dia").toLocalDate(), consulta.getTime("Hora").toLocalTime())));
            }
            return procedimentos;
        }catch(SQLException e) {
            return null;
        }
    }
}