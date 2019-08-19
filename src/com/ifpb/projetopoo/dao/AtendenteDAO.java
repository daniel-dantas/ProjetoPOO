/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Atendente;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class AtendenteDAO implements DAO<Atendente> {

    private static final List<Atendente> listaAtendentes = new ArrayList<>();

    @Override
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
        if (res >= 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Atendente elemento, Atendente novoElemento) {

        for (int i = 0; i < listaAtendentes.size(); i++) {
            if (listaAtendentes.get(i).equals(elemento)) {
                listaAtendentes.remove(i);
                listaAtendentes.add(novoElemento);
                return true;
            }
        }

        return false;

    }

    @Override
    public boolean remove(Atendente elemento) {

        for (int i = 0; i < listaAtendentes.size(); i++) {
            if (listaAtendentes.get(i).equals(elemento)) {
                listaAtendentes.remove(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public List<Atendente> read() {
        return listaAtendentes;
    }

    public boolean autenticar(String usuario, String senha) {

        for (Atendente ate : listaAtendentes) {
            if (ate.getUsuario().equals(usuario) && ate.getSenha().equals(senha)) {
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

}
