/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import com.ifpb.projetopoo.model.Paciente;
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
public class PacienteDAO implements DAO<Paciente> {

    public boolean create(Paciente paciente) {
        boolean resultado;
        resultado = addPaciente(paciente);
        List<String> descricao = paciente.getDescricao();
        for (String aux : descricao) {
            boolean resposta = addDescricao(paciente.getCpf(), aux);
            if (!resposta) {
                resultado = false;
            }
        }
        return resultado;
    }

    public boolean addPaciente(Paciente paciente) {
        String insertTo = "INSERT INTO Paciente(Cpf, Nome, Nascimento, Endereco";
        String values = " VALUES('" + paciente.getCpf() + "','" + paciente.getNome() + "','" + Date.valueOf(paciente.getNascimento()) + "','"
                + paciente.getEndereco().getRua() + " " + paciente.getEndereco().getBairro() + " " + paciente.getEndereco().getCidade() + " "
                + paciente.getEndereco().getEstado() + "',";

        if (paciente.getContato().getEmail() != null) {
            insertTo += ", Email";
            values += "'" + paciente.getContato().getEmail() + "',";
        }
        insertTo += ", Telefone)";
        values += "'" + paciente.getContato().getTelefone() + "')";

        Conexao con = new Conexao();
        int res = con.executeUpdate(insertTo + values);
        return res >= 1;
    }

    public boolean addDescricao(String cpfpaciente, String descricao) {
        String sql = "INSERT INTO Descricao VALUES('" + cpfpaciente + "','" + descricao + "')";
        Conexao con = new Conexao();
        int res = con.executeUpdate(sql);
        return res >= 1;
    }

    public boolean update(String Cpf, Paciente paciente) {
        String sql = "UPDATE Paciente SET Nome='" + paciente.getNome() + "', Nascimento='" + paciente.getNascimento() + "', Endereco='" + paciente.getEndereco().getRua()+"', Email='"
                + paciente.getContato().getEmail() + "', Telefone='" + paciente.getContato().getTelefone() + "'" + " WHERE Cpf='" + Cpf + "'";

        Conexao con = new Conexao();
        int resultado = con.executeUpdate(sql);

        return resultado >= 1;
    }

    public boolean remove(Paciente elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paciente search(String Cpf) {
        String sql = "SELECT * FROM Paciente";
        sql += " Where Cpf='" + Cpf + "'";
        Conexao con = new Conexao();
        try {
            ResultSet consulta = con.executeQuery(sql);
            consulta.next();
            Endereco endereco = new Endereco(consulta.getString("Endereco"), null, null, null);
            endereco.setEnderecoCompleto();
            return new Paciente(consulta.getString("Cpf"), consulta.getString("Nome"), consulta.getDate("Nascimento").toLocalDate(), endereco, new Contato(consulta.getString("Email"), consulta.getString("Telefone")));
        } catch (SQLException e) {
            return null;
        }
    }

    public List<Paciente> read() {

        List<Paciente> pacientes = new ArrayList<>();

        String sql = "SELECT * FROM Paciente";

        Conexao con = new Conexao();
        try {
            ResultSet consulta = con.executeQuery(sql);

            while (consulta.next()) {
                Endereco endereco = new Endereco(consulta.getString("Endereco"), null, null, null);
                endereco.setEnderecoCompleto();
                pacientes.add(new Paciente(consulta.getString("Cpf"), consulta.getString("Nome"), consulta.getDate("Nascimento").toLocalDate(), endereco, new Contato(consulta.getString("Email"), consulta.getString("Telefone"))));
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar");
        }

        return pacientes;
    }

}
