/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Medico;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFPB
 */
public class MedicoDAO implements DAO<Medico>{
    @Override
    public boolean create(Medico medico) {
        boolean resultado;
        resultado = addMedico(medico);
        List<String> especialidades = medico.getEspecialidades();
        for(String aux : especialidades) {
            boolean resposta = addEspecialidade(medico.getCpf(), aux);
            if(!resposta){
                resultado = false;
            }
        }
        return resultado;
    }
    
    public boolean addMedico(Medico medico){
        String sql = "INSERT INTO Medico VALUES('" + medico.getCpf() + "','" + medico.getNome() + "'," + medico.getSalario() + ",'" + 
                Date.valueOf(medico.getDataAdmissao()) + "','" + Date.valueOf(medico.getNascimento()) + "','" + medico.getEndereco().getRua() + " " + 
                medico.getEndereco().getBairro() + " " + medico.getEndereco().getCidade() + " " + medico.getEndereco().getEstado() + "','" + 
                medico.getContato().getEmail() + "','" + medico.getContato().getTelefone() + "')";
        Conexao con = new Conexao();
        int res = con.executeUpdate(sql);
        if (res >= 1) {
            return true;
        }
        return false;
    }
    
    public boolean addEspecialidade(String cpfMedico, String especialidade){
        String sql = "INSERT INTO Especialidade VALUES('" + cpfMedico + "','" + especialidade + "')";
         Conexao con = new Conexao();
        int res = con.executeUpdate(sql);
        if (res >= 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Medico elemento, Medico novoElemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Medico elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medico> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
