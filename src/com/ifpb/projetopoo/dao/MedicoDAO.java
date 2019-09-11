/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import com.ifpb.projetopoo.model.Medico;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFPB
 */
public class MedicoDAO implements DAO<Medico>{
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
        String insertTo = "INSERT INTO Medico(Cpf, Nome, Salario, DataAdmissao, Nascimento, Endereco";
        
        String values = " VALUES('" + medico.getCpf() + "','" + medico.getNome() + "'," + medico.getSalario() + ",'" + 
                Date.valueOf(medico.getDataAdmissao()) + "','" + Date.valueOf(medico.getNascimento()) + "','" + medico.getEndereco().getRua() + " " + 
                medico.getEndereco().getBairro() + " " + medico.getEndereco().getCidade() + " " + medico.getEndereco().getEstado() + "'";
        
        if(medico.getContato().getEmail() != null){
            insertTo += ", Email";
            values += ",'" + medico.getContato().getEmail() + "'";
        }
        
        if(medico.getContato().getTelefone() != null) {
            insertTo += ", Telefone";
            values += ",'" + medico.getContato().getTelefone() + "'";
        }
        
        insertTo += ")";
        values += ")";
        
        Conexao con = new Conexao();
        int res = con.executeUpdate(insertTo + values);
        return res >= 1;
    }
    
    public boolean addEspecialidade(String cpfMedico, String especialidade){
        String sql = "INSERT INTO Especialidade VALUES('" + cpfMedico + "','" + especialidade + "')";
         Conexao con = new Conexao();
        int res = con.executeUpdate(sql);
        return res >= 1;
    }
    
    public List<String> readEspecialidades(String cpfMedico) {
        List <String> especialidades = new ArrayList<>();
        
        String sql = "SELECT * FROM Especialidade WHERE CpfMedico='" + cpfMedico + "'";
        
        Conexao con = new Conexao();
        try{
            ResultSet consulta = con.executeQuery(sql);
            while(consulta.next()){
                especialidades.add(consulta.getString("Especialidade"));
            }
            
            return especialidades;
        }catch(SQLException e) {
            return null;
        }
    }

    public boolean update(String Cpf, Medico medico) {
        String sql = "UPDATE Medico SET Nome='" + medico.getNome() + "', Salario=" + medico.getSalario() + ", DataAdmissao='" + medico.getDataAdmissao() + 
                "', Nascimento='" + medico.getNascimento() + "', Endereco='" + medico.getEndereco().getRua() + " " + medico.getEndereco().getBairro() + " " + 
                medico.getEndereco().getCidade() + " " + medico.getEndereco().getEstado() + "', Email='" + medico.getContato().getEmail() + "', Telefone='" + 
                medico.getContato().getTelefone() + "'" + " WHERE Cpf='" + Cpf + "'";
        
        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);
        
        return resultado >= 1;
    }

    public boolean remove(String elemento) {
        String sql = "DELETE FROM Medico WHERE Cpf='" + elemento + "'";
        
        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);
        
        return resultado >= 1;
    }

    public Medico search(String Cpf) {
        String sql = "SELECT * FROM Medico";
        sql += " Where Cpf='" + Cpf + "'";
        Conexao con = new Conexao();
        try{
            ResultSet consulta = con.executeQuery(sql);
            consulta.next();
            return new Medico(consulta.getFloat("Salario"), consulta.getDate("DataAdmissao").toLocalDate(), consulta.getString("Cpf"), consulta.getString("Nome"), consulta.getDate("Nascimento").toLocalDate(), new Endereco(consulta.getString("Endereco"), null, null, null), new Contato(consulta.getString("Email"), consulta.getString("Telefone")));
        }catch(SQLException e) {
            return null;
        }
    }

    @Override
    public List<Medico> read() {
        List<Medico> listaMedicos = new ArrayList<>();
        
        String sql = "SELECT * FROM Medico";
        Conexao con = new Conexao();
        
        try{
            ResultSet consulta = con.executeQuery(sql);
            
            while(consulta.next()){
                listaMedicos.add(new Medico(consulta.getFloat("Salario"), consulta.getDate("DataAdmissao").toLocalDate(), consulta.getString("Cpf"), consulta.getString("Nome"), consulta.getDate("Nascimento").toLocalDate(), new Endereco(consulta.getString("Endereco"), null, null, null), new Contato(consulta.getString("Email"), consulta.getString("Telefone"))));
            }
            
            
        }catch(SQLException e) {
            
        }
        
        return listaMedicos;
        
    }

    
    
    
}
