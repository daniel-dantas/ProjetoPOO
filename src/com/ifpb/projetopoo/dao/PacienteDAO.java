/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Paciente;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author IFPB
 */
public class PacienteDAO implements DAO<Paciente>{

    @Override
    public boolean create(Paciente paciente) {
        String sql = "INSERT INTO Paciente VALUES('" + paciente.getCpf() + "','" + paciente.getNome() + "','" + Date.valueOf(paciente.getNascimento()) + "','" + paciente.getEndereco().getRua() + " " + 
                paciente.getEndereco().getBairro() + " " + paciente.getEndereco().getCidade() + " " + paciente.getEndereco().getEstado() + "','" + 
                paciente.getContato().getEmail() + "','" + paciente.getContato().getTelefone() + "')";
        Conexao con = new Conexao();
        int res = con.executeUpdate(sql);
        if (res >= 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Paciente elemento, Paciente novoElemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Paciente elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
