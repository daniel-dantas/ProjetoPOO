/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Exame;

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
}
