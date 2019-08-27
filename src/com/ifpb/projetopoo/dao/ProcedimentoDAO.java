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

/**
 *
 * @author IFPB
 */
public class ProcedimentoDAO {

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
    
    public Procedimento read(int id, String tipo){
        String sql = "SELECT * FROM Procedimento";
        sql += " Where Id='" + id + "'";
        Conexao con = new Conexao();
        try{
            ResultSet consulta = con.executeQuery(sql);
            consulta.next();
            if (tipo.equals("consulta")) {
                return new Consulta(null, null, consulta.getString("CpfPaciente"), LocalDateTime.of(consulta.getDate("Dia").toLocalDate(), consulta.getTime("Hora").toLocalTime()));
            } else {
                return new Exame(null, null, null, consulta.getString("CpfPaciente"), LocalDateTime.of(consulta.getDate("Dia").toLocalDate(), consulta.getTime("Hora").toLocalTime()));
            }
        }catch(SQLException e) {
            return null;
        }
    }
}