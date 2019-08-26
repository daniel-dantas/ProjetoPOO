/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Procedimento;
import java.sql.Date;
import java.sql.Time;

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

}
