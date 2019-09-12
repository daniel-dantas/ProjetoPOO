/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Exame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFPB
 */
public class ExameDAO extends ProcedimentoDAO{
    public boolean create(Exame elemento) {
        int resultado = super.create(elemento);
        if(resultado>=1) {
            String insertInto = "INSERT INTO Exame(IdProcedimento, Tipo";
            String values = " VALUES (" + resultado + ",'" + elemento.getTipoDeExame()+ "'";
            
            if (elemento.getResultado() != null) {
                insertInto += ", Resultado";
                values += ",'" + elemento.getResultado() + "'";
            }
            
            insertInto += ")";
            values += ")";
            
            Conexao con = new Conexao();
            int res = con.executeUpdate(insertInto + values);
            return res >= 1;
        }
        return false;
    }
    
    public boolean update(int id, Exame elemento) {
        boolean retorno = super.update(id, elemento);
        
        String sql = "UPDATE Exame SET Resultado='" + elemento.getResultado() + "' WHERE IdProcedimento=" + id;
        
        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);
        
        if(resultado < 1) {
            retorno = false;
        }
        
        return retorno;
    }
    
    public boolean remove(long id) {
        boolean resposta = super.remove(id);
        
        if (resposta) {
            String sql = "DELETE FROM Exame WHERE IdProcedimento='" + id + "'";
        
            Conexao con = new Conexao();
            int resultado = con.executeUpdate(sql);

            return resultado >= 1;
        }
        
        return false;
        
    }
    
    public List<Exame> read(String Cpf) {
        List <ProcedimentoDAO> procedimentos = super.readPrimario(Cpf);
        List <Exame> exames = new ArrayList<>();
        for(ProcedimentoDAO procedimento : procedimentos) {
            String sql = "SELECT * FROM Exame";
            sql += " Where IdProcedimento='" + procedimento.getId() + "'";
            Conexao con = new Conexao();
            try{
                ResultSet consulta = con.executeQuery(sql);
                consulta.next();
                Exame novo = new Exame(null, consulta.getString("Tipo"), consulta.getString("Resultado"), procedimento.getCpfPaciente(), procedimento.getMomento());
                novo.setId(procedimento.getId());
                exames.add(novo);
            }catch(SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
        return exames;
    }
    
}
