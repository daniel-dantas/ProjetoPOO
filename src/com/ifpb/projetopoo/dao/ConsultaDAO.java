/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Consulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFPB
 */
public class ConsultaDAO extends ProcedimentoDAO{
    
    public boolean create(Consulta elemento) {
        int resultado = super.create(elemento);
        if(resultado>=1) {
            String insertInto = "INSERT INTO Consulta(IdProcedimento, CpfMedico";
            String values = " VALUES (" + resultado + ",'" + elemento.getCpfDoMedico() + "'";
            
            if (elemento.getSintomas() != null) {
                insertInto += ", Sintomas";
                values += ",'" + elemento.getSintomas() + "'";
            }
            
            insertInto += ")";
            values += ")";
            
            Conexao con = new Conexao();
            int res = con.executeUpdate(insertInto + values);
            return res >= 1;
        }
        return false;
    }
    
    public boolean update(int id, Consulta elemento) {
        boolean retorno = super.update(id, elemento);
        
        String sql = "UPDATE Consulta SET Sintomas='" + elemento.getSintomas() + "' WHERE IdProcedimento=" + id;
        
        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);
        
        if(resultado < 1) {
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Consulta> read(String Cpf) {
        List <Consulta> consultas = new ArrayList<>();
        List <ProcedimentoDAO> procedimentos = super.readPrimario(Cpf);
        for(ProcedimentoDAO procedimento : procedimentos){
            String sql = "SELECT * FROM Consulta";
            sql += " Where IdProcedimento='" + procedimento.getId() + "'";
            Conexao con = new Conexao();
            try{
                ResultSet consulta = con.executeQuery(sql);
                consulta.next();
                Consulta novo = new Consulta(consulta.getString("Sintomas"), consulta.getString("CpfMedico"), procedimento.getCpfPaciente(), procedimento.getMomento());
                novo.setId(procedimento.getId());;
                consultas.add(novo);
            }catch(SQLException e) {
                return null;
            }
        }
        return consultas;
    }
    
    public boolean remove(long id) {
        boolean resposta = super.remove(id);
        
        if (resposta) {
            String sql = "DELETE FROM Consulta WHERE IdProcedimento='" + id + "'";
        
            Conexao con = new Conexao();
            int resultado = con.executeUpdate(sql);

            return resultado >= 1;
        }
        
        return false;
        
    }
}
