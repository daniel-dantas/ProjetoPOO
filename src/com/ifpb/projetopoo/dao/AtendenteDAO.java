/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Atendente;
import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import com.ifpb.projetopoo.model.Paciente;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class AtendenteDAO implements DAO<Atendente>{

    private static final List<Atendente> listaAtendentes = new ArrayList<>();

    public boolean create(Atendente atendente) {
        String insertTo = "INSERT INTO Atendente(Cpf, Nome, Salario, DataAdmissao, UserName, Senha, Nascimento, Endereco";
        
        String values = " VALUES('" + atendente.getCpf() + "','" + atendente.getNome() + "'," + atendente.getSalario() + ",'" + 
                Date.valueOf(atendente.getDataAdmissao()) + "','" + atendente.getUsuario() + "','" + atendente.getSenha() + "','" + 
                Date.valueOf(atendente.getNascimento()) + "','" + atendente.getEndereco().getRua() + " " + atendente.getEndereco().getBairro() + " " + 
                atendente.getEndereco().getCidade() + " " + atendente.getEndereco().getEstado() + "',";
        
        if(atendente.getContato().getEmail() != null){
            insertTo += ", Email";
            values += "'" + atendente.getContato().getEmail() + "',";
        }
        insertTo += ", Telefone)";
        values += "'" + atendente.getContato().getTelefone() + "')";
        
        Conexao con = new Conexao();
        int res = con.executeUpdate(insertTo + values);
        return res >= 1;
    }

    public boolean update(String Cpf, Atendente atendente) {
        String sql = "UPDATE Atendente SET Nome='" + atendente.getNome() + "', Salario=" + atendente.getSalario() + ", DataAdmissao='" + atendente.getDataAdmissao() + 
                "', UserName='" + atendente.getUsuario() + "', Senha='" + atendente.getSenha() + "', Nascimento='" + atendente.getNascimento() + "', Endereco='" + 
                atendente.getEndereco().getRua() + " " + atendente.getEndereco().getBairro() + " " + atendente.getEndereco().getCidade() + " " + 
                atendente.getEndereco().getEstado() + "', Email='" + atendente.getContato().getEmail() + "', Telefone='" + atendente.getContato().getTelefone() + "'" + 
                "WHERE Cpf='" + Cpf + "'";
        
        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);
        
        return resultado >= 1;
    }

    public boolean remove(Atendente elemento) {

        for (int i = 0; i < listaAtendentes.size(); i++) {
            if (listaAtendentes.get(i).equals(elemento)) {
                listaAtendentes.remove(i);
                return true;
            }
        }

        return false;
    }
    
    public boolean authentication (String usuario, String senha) {
        String sql = "SELECT * FROM Atendente";
        sql += " Where Username='" + usuario + "'";
        Conexao con = new Conexao();
        try{
            ResultSet consulta = con.executeQuery(sql);
            consulta.next();
            String senhaReal = consulta.getString("Senha");
            return senhaReal.equals(senha);
        }catch(SQLException e) {
            return false;
        }
    }

    public Atendente search(String Cpf) {
        String sql = "SELECT * FROM Atendente";
        sql += " Where Cpf='" + Cpf + "'";
        Conexao con = new Conexao();
        try{
            ResultSet consulta = con.executeQuery(sql);
            consulta.next();
            return new Atendente(consulta.getFloat("Salario"), consulta.getDate("DataAdmissao").toLocalDate(), consulta.getString("Cpf"), consulta.getString("Nome"), consulta.getDate("Nascimento").toLocalDate(), consulta.getString("UserName"), consulta.getString("Senha"), new Endereco(consulta.getString("Endereco"), null, null, null), new Contato(consulta.getString("Email"), consulta.getString("Telefone")));
        }catch(SQLException e) {
            return null;
        }
    }

    @Override
    public List<Atendente> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    

}
